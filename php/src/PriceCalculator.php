<?php declare(strict_types=1);

namespace Kata;

class PriceCalculator
{
    public function calculate(array $books): float
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

        if (count($books) >= 1) {
            return 8 * count($books);
        }

        return 0;
    }
}
