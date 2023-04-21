<?php declare(strict_types=1);

namespace Kata;

class PriceCalculator
{
    public function calculate(array $books): float
    {
        $booksGrouped = array_count_values($books);

        $basket = [];
        foreach($booksGrouped as $book => $quantity) {
            if ($quantity === 2) {
                $basket[] = $book;
                unset($books[$book]);
            }
        }

        return array_sum(
            array_map(fn($aBasket) => $this->calculateBasketPrice($aBasket), [$basket, $books])
        );
    }

    public function calculateBasketPrice(array $books): float
    {
        if (count(array_unique($books)) === 2) {
            return (8 * count($books) * 0.95);
        }

        if (count(array_unique($books)) === 3) {
            return (8 * count($books) * 0.9);
        }

        if (count(array_unique($books)) === 4) {
            return (8 * count($books) * 0.8);
        }

        if (count(array_unique($books)) === 5) {
            return (8 * count($books) * 0.75);
        }

        if (count($books) >= 1) {
            return 8 * count($books);
        }

        return 0;
    }
}
