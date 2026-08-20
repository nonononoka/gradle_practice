import kotlin.test.Test
import kotlin.test.assertEquals
import com.example.core.CoreHello

class CoreHelloTest{

    @Test
    fun testAdd(){
        val core = CoreHello()
        val result = core.add(2,3)
        assertEquals(5, result)
    }
}