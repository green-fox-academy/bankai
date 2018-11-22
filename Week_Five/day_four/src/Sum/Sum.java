package Sum;

import java.util.ArrayList;

public class Sum {

  public int sumOfIntegers(ArrayList<Integer> numbers)  {
    if (numbers == null)  {
      return 0;
    }
    int sum = 0;
    for (Integer number : numbers) {
      if (number != null) {
        sum += number;
      }
    }
    return sum;
  }
}
