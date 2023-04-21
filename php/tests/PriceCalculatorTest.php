<?php declare(strict_types=1);

namespace KataTests;

use Kata\PriceCalculator;
use PHPUnit\Framework\TestCase;

class PriceCalculatorTest extends TestCase
{
    /** @test */
    public function price_is_zero_for_no_books(): void
    {
        $priceCalculator = new PriceCalculator();

        self::assertEquals(0, $priceCalculator->calculate([]));
    }
}
