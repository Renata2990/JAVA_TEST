package my.education;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPoint {
  @Test
  public void testDistancesamePoint() {
    // Создеются объекты и две точки с координатами
    Point p1 = new Point(0, 0);
    Point p2 = new Point(3, 4);
    // Вызываем метод вычисления расстояния между точками - p1.distanceTo(p2). Он возвращает расстояние между точками p1 и p2
    Assert.assertEquals(p1.distanceTo(p2), 5.0, 0.0001);  // Если решение правильное, код отработает.

    // 5.0 — ожидаемое значение
    // 0.0001 — допустимая погрешность (delta)

  }

  @Test
  public void testDistanceSamePoint() {
    Point p1 = new Point(1, 1);
    Assert.assertEquals(p1.distanceTo(p1), 0.0, 0.0001);
  }


  @Test
  public void testDistanceHorizontal() {
    Point p1 = new Point(0, 0);
    Point p2 = new Point(5, 0);
    Assert.assertEquals(p1.distanceTo(p2), 5.0, 0.0001);
  }
}


