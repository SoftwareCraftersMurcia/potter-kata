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

    private fun price(books: List<Int>): Int {
        return books.size * 8
    }
}
