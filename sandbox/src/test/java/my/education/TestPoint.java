package my.education;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPoint {
    @Test
    public void testDistancesamePoint() {
      Point p1 = new Point(0, 0);
      Point p2 = new Point(0, 0);
      Assert.assertEquals(p1.distanceTo(p2), 0.0, "Расстояние между одной и той же точкой должно быть 0");

    }


  }
}

