package Counter.test;

import static org.junit.jupiter.api.Assertions.*;

import Counter.CountLetters;
import org.junit.jupiter.api.Test;

public class CountLettersTest {
  @Test
  public void should_returnHashmapWithLettersAsKeysAndRepetitionsAsIntegers_whenSentenceInput() {

    CountLetters counters = new CountLetters();

    String text = "Welcome to Hell, Dante";

    Integer result = 4;
    assertEquals(result, counters.countLetters(text).get("e"));

  }

  @Test
  public void returnNull_whenBlankInput() {

    CountLetters counters = new CountLetters();

    String text = "Welcome to Hell, Dante";

    Integer result = null;
    assertEquals(result, counters.countLetters(text).get(" "));

  }

}