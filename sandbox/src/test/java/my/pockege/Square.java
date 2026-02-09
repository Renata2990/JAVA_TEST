package my.pockege;

public class Square {

  public double l;  // атрибуты

  public Square(double l) {  // конструктор
    //l = len;
    this.l = l; // (атрибут = переменная)
  }

  public double area() {
    return this.l * this.l;

  }

}
