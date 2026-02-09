package my.pockege;

public class Rectangle {

  public double a;  // атрибуты
  public double b;

  public Rectangle(double a, double b) {  // конструктор
    this.a = a;
    this.b = b;

  }

  public double area() {
    return this.a * this.b;
  }


}
