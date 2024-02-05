public class Car {
  private int seats;
  private String engine;
  private Integer tripComputer;
  private GPS gps;

  public Car(){
    this.seats = 0;
    this.tripComputer = 0;
    this.gps = GPS.NOT_INTEGRATED;
  }

  public int getSeats() {
    return this.seats;
  }

  public void setSeats(int seats) {
    this.seats = seats;
  }

  public String getEngine() {
    return this.engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public Integer getTripComputer() {
    return this.tripComputer;
  }

  public void setTripComputer(Integer tripComputer) {
    this.tripComputer = tripComputer;
  }

  public GPS getGps() {
    return this.gps;
  }

  public void setGps(GPS gps) {
    this.gps = gps;
  }

  public enum GPS {
    INTEGRATED, NOT_INTEGRATED
  }
}