import org.junit.Assert.assertEquals
import org.junit.Test

class Test1 {

  @Test
  def testA() =
    assertEquals(true, true)

  @Test
  def testB() =
    assertEquals(true, true)

  @Test
  def testC() =
    assertEquals(true, true)

  @Test
  def failingTest() =
    assertEquals(false, true)
}
