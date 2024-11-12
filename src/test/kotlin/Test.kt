import org.example.average
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {

    @Test
    fun test1() {
        val values = arrayOf(1, 2, 3, 4)
        val min = 5
        val max = 10

        val result = average(values, min, max)
        assertEquals(result ,-999)
    }

    @Test()
    fun test2() {
        val values = arrayOf(6, 10)
        val min = 1
        val max = 6

        val result = average(values, min, max)
        assertEquals(result ,6)
    }
    @Test()
    fun test3() {
        val values = arrayOf(2, 2, 3)
        val min = 0
        val max = 1

        val result = average(values, min, max)
        assertEquals(result ,-999)
    }
}