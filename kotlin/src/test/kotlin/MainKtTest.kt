import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MainKtTest {
    @Test
    fun empty_bag() {
        Assertions.assertEquals(0, price(listOf<Int>()))
    }

    @Test
    fun one_item_in_bag() {
        Assertions.assertEquals(0, price(listOf<Int>()))
    }

    private fun price(books: List<Int>): Int {
        return 0
    }
}
