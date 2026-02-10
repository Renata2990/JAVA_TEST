package my.pockege;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SquareTests {

  @Test      // аннотация тестового метода, чтобы framework смог его распознать как тест. Аннотация тоже класс.
  public  void testArea() {
    Square s = new Square(5);
    // assert  s.area() == 24;  // "==" сравнение двух величин
    Assert.assertEquals(s.area(), 25.0); // Assert - вспомогательный класс,для получения подрробного сообщения об ошибках
                                                 // assertEquals - функция. Для его использования не нужно создавать к-либо объект.
                                                 // к ней можно напрямую обращаться. Но перед ней нужно указать имя класса Assert

  }

}
