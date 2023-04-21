import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MainKtTest {
    @Test
    fun empty_bag() {
        Assertions.assertEquals(0, price(listOf<Int>()))
    }

    @Test
    fun one_item_in_bag_has_no_discount() {
        Assertions.assertEquals(8, price(listOf<Int>(1)))
    }

    @Test
    fun two_different_books_in_bag_has_5_percent_of_discount() {
        Assertions.assertEquals(8 * 2 * 0.95, price(listOf<Int>(1, 2)))
    }

    @Test
    fun two_same_books_in_bag_has_no_discount() {
        Assertions.assertEquals(8 * 2, price(listOf<Int>(1, 1)))
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

    private fun price(books: List<Int>): Any {
        return when (books.toSet().size) {
            2 ->  books.size * 8 * 0.95
            3 ->  books.size * 8 * 0.90
            4 ->  books.size * 8 * 0.80
            5 ->  books.size * 8 * 0.75
            else ->  books.size * 8
        }
    }
}
