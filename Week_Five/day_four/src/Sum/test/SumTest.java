package Sum.test;

import static org.junit.jupiter.api.Assertions.*;

import Sum.Sum;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class SumTest {
  Sum sum = new Sum();

  @Test
  public void sumOfIntegers() {
    ArrayList<Integer> numbers = new ArrayList<>();

    for (int i = 0; i < 3; i++) {
      numbers.add(i);
    }
    int result = 3;

    assertEquals(result, sum.sumOfIntegers(numbers));
  }

  @Test
  public void returns0_when_emptyListInput() {
    ArrayList<Integer> numbers = new ArrayList<>();

    int result = 0;

    assertEquals(result, sum.sumOfIntegers(numbers));

  }

  @Test
  public void returnElement_when_oneElementInput() {
    ArrayList<Integer> numbers = new ArrayList<>();

    int result = 7;

    numbers.add(result);

    assertEquals(result, sum.sumOfIntegers(numbers));

  }

  @Test
  public void should_returnSumOfIntegers_when_oneElementIsNullInput() {
    ArrayList<Integer> numbers = new ArrayList<>();

    for (int i = 0; i < 3; i++) {
      numbers.add(i);
    }

    numbers.add(null);

    int result = 3;

    assertEquals(result, sum.sumOfIntegers(numbers));

  }
}