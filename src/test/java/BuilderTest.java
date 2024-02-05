import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderTest {
  @Test
  void director_make_suv() {
    Director director = new Director();
    CarBuilder builder = new CarBuilder();
    builder.reset();
    Car car = builder.getResult();
    director.makeSUV(builder);
    assertEquals(Car.class, car.getClass());
    assertEquals("SUV", car.getEngine());
  }

  @Test
  void director_make_sport() {
    Director director = new Director();
    CarBuilder builder = new CarBuilder();
    builder.reset();
    Car car = builder.getResult();
    director.makeSportsCar(builder);
    assertEquals(Car.class, car.getClass());
    assertEquals("Sport", car.getEngine());
  }
}
