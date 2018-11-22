package Fibonacci.test;

import static org.junit.jupiter.api.Assertions.*;
import Fibonacci.Fibonacci;
import org.junit.Test;

public class FibonacciTest {
  @Test
  public void shouldReturnFibonacciNumber() {

    int input = 3;

    int result = 1;

    assertEquals(result,Fibonacci.fibonacciNumber(input));

  }

  @Test
  public void shouldReturnNegative() {

    int input = -10;

    int result = -1;

    assertEquals(result, Fibonacci.fibonacciNumber(input));

  }
}