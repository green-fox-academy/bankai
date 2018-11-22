package Extension.test;

import static org.junit.jupiter.api.Assertions.*;

import Extension.Extension;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ExtensionTest {
  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  void testMaxOfThreeFirst() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }

  @Test
  void testMaxOfThreeThird() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  void testMedianFour() {
    assertEquals(5, extension.median(Arrays.asList(7,5,3,5)));
  }

  @Test
  void testMedianFive() {
    assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }
  @Test
  void testTranslateBemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }

}