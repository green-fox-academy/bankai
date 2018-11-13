package Sharpie;

public class Sharpie {
    String color;
    float width;
    float inkAmount;

    @Override
    public String toString() {
        return "Sharpie{" +
                "color = '" + color + '\'' +
                ", width = " + width +
                ", inkAmount = " + inkAmount +
                '}';
    }

    public Sharpie(String color, float width) {
      this.color = color;
      this.width = width;
      inkAmount = 100;
  }

  public void use() {
        inkAmount--;
  }
}
