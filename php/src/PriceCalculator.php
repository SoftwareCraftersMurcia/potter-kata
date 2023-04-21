<?php declare(strict_types=1);

namespace Kata;

class PriceCalculator
{
    public function calculate(array $books): int // cents
    {
        if (count($books) === 1) {
            return 8;
        }
        return 0;
    }
}
