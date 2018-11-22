package Animal.test;

import static org.junit.jupiter.api.Assertions.*;

import Animal.Animal;
import org.junit.jupiter.api.Test;

public class AnimalTest {

  @Test
  public void eatReduceHunger() {
    Animal animal = new Animal();

    Animal.eat(animal);

    int result = 49;
    assertEquals(result,animal.hunger);
  }

  @Test
  void drink() {
    Animal animal = new Animal();

    Animal.drink(animal);

    int result = 49;

    assertEquals(result, animal.thirst);
  }

  @Test
  void play() {
    Animal animal = new Animal();

    Animal.play(animal);

    int result = 51;

    boolean hungerAndThirst = (result == animal.hunger && result ==animal.thirst);

    assertTrue(hungerAndThirst);
  }
}
