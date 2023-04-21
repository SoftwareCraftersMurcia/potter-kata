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
    fun two_different_items_in_bag_has_5_percent_of_discount() {
        Assertions.assertEquals(8 * 2 * 0.95, price(listOf<Int>(1, 2)))
    }

    @Test
    fun two_same_items_in_bag_has_no_discount() {
        Assertions.assertEquals(8 * 2, price(listOf<Int>(1, 1)))
    }

    @Test
    fun three_different_items_in_bag_has_ten_percen_discount() {
        Assertions.assertEquals(8 * 3 * 0.90, price(listOf<Int>(1, 2, 3)))
    }

    private fun price(books: List<Int>): Any {
        if (books.toSet().size == 2) {
            return books.size * 8 * 0.95
        }
        if (books.toSet().size == 3) {
            return books.size * 8 * 0.90
        }
        return books.size * 8
    }
}
