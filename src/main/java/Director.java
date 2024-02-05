public class Director {
  public void makeSUV(Builder builder) {
    builder.setSeats(5);
    builder.setTripComputer(1500);
    builder.setEngine("SUV");
    builder.setGPS(Car.GPS.INTEGRATED);
  }
  public void makeSportsCar(Builder builder) {
    builder.setSeats(2);
    builder.setTripComputer(20000);
    builder.setEngine("Sport");
    builder.setGPS(Car.GPS.NOT_INTEGRATED);
  }

}