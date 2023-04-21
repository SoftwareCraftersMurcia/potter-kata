import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MainKtTest {
    @Test
    fun empty_bag() {
        Assertions.assertEquals(0.0, price(listOf<Int>()))
    }

    @Test
    fun one_item_in_bag_has_no_discount() {
        Assertions.assertEquals(8.0, price(listOf<Int>(1)))
    }

    @Test
    fun two_different_books_in_bag_has_5_percent_of_discount() {
        Assertions.assertEquals(8 * 2 * 0.95, price(listOf<Int>(1, 2)))
    }

    @Test
    fun two_same_books_in_bag_has_no_discount() {
        Assertions.assertEquals((8 * 2).toDouble(), price(listOf<Int>(1, 1)))
    }

    @Test
    fun three_different_books_in_bag_has_10_percen_discount() {
        Assertions.assertEquals(8 * 3 * 0.90, price(listOf<Int>(1, 2, 3)))
    }

    @Test
    fun four_different_books_in_bag_has_20_percen_discount() {
        Assertions.assertEquals(8 * 4 * 0.80, price(listOf<Int>(1, 2, 3, 4)))
    }

    @Test
    fun five_different_books_in_bag_has_25_percen_discount() {
        Assertions.assertEquals(8 * 5 * 0.75, price(listOf<Int>(1, 2, 3, 4, 5)))
    }

    @Test
    fun bag_with_theee_books_two_or_theme_are_equals_has_5_percent_of_discount_over_two_of_theme() {
        Assertions.assertEquals(8 * 2 * 0.95 + 8, price(listOf<Int>(1, 1, 2)))
    }

    private fun price(books: List<Int>): Double {
        val diffentBooks = books.toSet().size;
        val differentBooksPrice =  when (diffentBooks) {
            2 ->  diffentBooks * 8 * 0.95
            3 ->  diffentBooks * 8 * 0.90
            4 ->  diffentBooks * 8 * 0.80
            5 ->  diffentBooks * 8 * 0.75
            else ->  diffentBooks * 8
        }.toDouble()

        return differentBooksPrice + ((books.size - diffentBooks) * 8); 
    }
}
