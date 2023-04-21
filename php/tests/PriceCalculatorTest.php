<?php declare(strict_types=1);

namespace KataTests;

use Kata\PriceCalculator;
use PHPUnit\Framework\TestCase;

class PriceCalculatorTest extends TestCase
{
    /** @test */
    public function price_for_no_books(): void
    {
        $priceCalculator = new PriceCalculator();

        self::assertEquals(0, $priceCalculator->calculate([]));
    }

    /** @test */
    public function price_for_one_book(): void
    {
        $priceCalculator = new PriceCalculator();

        self::assertEquals(8, $priceCalculator->calculate([1]));
    }

    /** @test */
    public function price_for_three_equals_books(): void
    {
        $priceCalculator = new PriceCalculator();

        self::assertEquals(8 * 3, $priceCalculator->calculate([1, 1 ,1]));
    }

    /** @test */
    public function price_for_set_of_two_different_books(): void
    {
        $priceCalculator = new PriceCalculator();

        self::assertEquals(8 * 2 * 0.95, $priceCalculator->calculate([1, 2]));
    }

    /** @test */
    public function price_for_set_of_three_different_books(): void
    {
        $priceCalculator = new PriceCalculator();

        self::assertEquals(8 * 3 * 0.9, $priceCalculator->calculate([1, 2, 4]));
    }


    /** @test */
    public function price_for_set_of_four_different_books(): void
    {
        $priceCalculator = new PriceCalculator();

        self::assertEquals(8 * 4 * 0.8, $priceCalculator->calculate([1, 2, 3, 4]));

    }
}
