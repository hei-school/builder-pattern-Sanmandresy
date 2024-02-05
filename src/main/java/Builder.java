public interface Builder {
  void reset();
  void setSeats(int number);
  void setEngine(String engine);
  void setTripComputer(Integer tripComputer);
  void setGPS(Car.GPS gps);
}