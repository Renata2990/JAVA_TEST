package my.pockege;

public class MyFirstProgram {

    public static void main(String[] args) {
      hello("World");
      hello("Guys");
      hello("Friends");

      double l = 5;
      System.out.println("Площадь квадрата со сторонами " + l + " = " + area(l));

      double a = 4;
      double b = 6;
      System.out.println("Площадь квадрата со сторонами " + a + " и " + b + " = " + area(a,b));

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
    public static double area (double len) {
      return len * len; // calculation of the area

  }

    public static double area (double a, double b) {
      return a * b;
  }

}