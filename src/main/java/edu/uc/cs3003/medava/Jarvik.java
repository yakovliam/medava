package edu.uc.cs3003.medava;

public class Jarvik implements Shippable {
  Jarvik(String deviceSerialNumber) {
    serialNumber = deviceSerialNumber;
  }

  public String getMedicineName() {
    return "Jarvik Artificial Heart";
  }

  public MedicineSchedule getSchedule() {
    return MedicineSchedule.Uncontrolled;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public boolean isTemperatureRangeAcceptable(Double lowTemperature, Double highTemperature) {
    return 30.0 <= lowTemperature && highTemperature <= 90.0;
  }

  private String serialNumber;
}
