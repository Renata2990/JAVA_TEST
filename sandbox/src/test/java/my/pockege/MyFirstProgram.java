package my.pockege;

public class MyFirstProgram {

    public static void main(String[] args) {
      hello("World");
      hello("Guys");
      hello("Friends");


      Square s = new Square(5);  // создание нового объекта
      //double l = 5;
      //s.l = 5;
      // System.out.println("Площадь квадрата со сторонами " + l + " = " + area(l));
      //System.out.println("Площадь квадрата со сторонами " + s.l + " = " + area(s));
      System.out.println("Площадь квадрата со сторонами " + s.l + " = " + s.area());


      Rectangle r = new Rectangle(4,6); // создание нового объекта
//      r.a = 4;
//      r.b = 6;
//      double a = 4;
//      double b = 6;
      System.out.println("Площадь квадрата со сторонами " + r.a + " и " + r.b + " = " + s.area());

//        String somebody = "World";
//        System.out.println("Hello, " + somebody + "!");
//        int l = 8;
//        int s = l * l;
//        double l = 8;
//        double s = l * l;
//        System.out.println("Площадь квадрата " + l + " = " + s);
    }

    public static void hello (String somebody) {
      System.out.println("Hello, " + somebody + "!");

  }

    //public static double area (double len) {
//    public static double area (Square s) {
//      return s.l * s.l; // calculation of the area
//
//  }

    //public static double area (double a, double b) {
//    public static double area (Rectangle r) {
//      return r.a * r.b;
//  }

}