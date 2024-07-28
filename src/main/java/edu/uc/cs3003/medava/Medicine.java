package edu.uc.cs3003.medava;

public abstract class Medicine implements Shippable {

  private final String mMedicineName;

  public Medicine(String medicineName) {
    mMedicineName = medicineName;
  }

  public String getMedicineName() {
    return mMedicineName;
  }

  public double minimumTemperature() {
    return 0.0;
  }

  public double maximumTemperature() {
    return 100.0;
  }

  public abstract MedicineSchedule getSchedule();

  public boolean isTemperatureRangeAcceptable(Double lowTemperature, Double highTemperature) {
    return this.minimumTemperature() <= lowTemperature &&
        highTemperature <= this.maximumTemperature();
  }
}
