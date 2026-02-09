package my.education;

public class Point {
  public double x;
  public double y;


  public Point(double x, double y) {  // конструктор
    this.x = x;
    this.y = y;

  }


  // статическая функция для вычисления расстояния между двумя точками
  public static double distance(Point p1, Point p2) {
    double dx = p2.x - p1.x;
    double dy = p2.y - p1.y;
    return Math.sqrt(dx * dx + dy * dy);
  }

  // Метод, вычисляющий расстояние до другой точки
  public double distanceTo(Point other) {
    double dx = other.x - this.x;
    double dy = other.y - this.y;
    return Math.sqrt(dx * dx + dy * dy);
  }

}

