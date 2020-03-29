import org.junit.Test;
import static org.junit.Assert.assertTrue;
class TestFibonacci{
  // 1 2 3 4 5 6 7 8  9  10 11 12 13  14  15
  // 0 1 1 2 3 5 8 13 21 34 55 89 144
  @Test
  public void Testcase1(){
    assertTrue(Fibonacci.getFib(1) == 0);
  }
  public void Testcase2(){
    assertTrue(Fibonacci.getFib(8) == 13);
  }
  public void Testcase3(){
    assertTrue(Fibonacci.getFib(12) == 89);

  }
}
