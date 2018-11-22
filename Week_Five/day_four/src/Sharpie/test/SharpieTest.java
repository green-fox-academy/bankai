package Sharpie.test;

import static org.junit.jupiter.api.Assertions.*;

import Sharpie.Sharpie;
import org.junit.Test;

public class SharpieTest {

  @Test
  public void decreaseInkAmount() {

    Sharpie sharpie = new Sharpie("piros", 10);

    int result = 99;

    Sharpie.use(sharpie);

    assertEquals(result, sharpie.inkAmount, 5);
  }
}