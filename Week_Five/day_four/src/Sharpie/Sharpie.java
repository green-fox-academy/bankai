package Sharpie;

public class Sharpie {

  public String color;
  public float width;
  public float inkAmount;

  public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
    inkAmount = 100;
  }

  public static void use(Sharpie sharpie) {
    sharpie.inkAmount--;
  }
}
