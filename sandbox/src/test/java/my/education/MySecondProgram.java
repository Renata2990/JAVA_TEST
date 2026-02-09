package my.education;

import my.pockege.Rectangle;

public class MySecondProgram {
  public static void main(String[] args) {

//    // Создаём две точки
//    Point p1 = new Point(4, 6);
//    Point p2 = new Point(6, 8);
//
//
//    // Вычисляем расстояние
//    double d = Point.distance(p1, p2);
//
//    // Выводим результат
//    System.out.println("Расстояние между точками: " + d);
//  }


    // Создаем несколько точек
    Point p1 = new Point(1,2);
    Point p2 = new Point(4,6);
    Point p3 = new Point(-1,-3);

    // используем метод distanceTo
    double d1 = p1.distanceTo(p2);
    double d2 = p1.distanceTo(p3);
    double d3 = p2.distanceTo(p3);

    System.out.println("Расстояние между p1 и p2: " + d1);
    System.out.println("Расстояние между p1 и p3: " + d2);
    System.out.println("Расстояние между p2 и p3: " + d3);

    }






  }

