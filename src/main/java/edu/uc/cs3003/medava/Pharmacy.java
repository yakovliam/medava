package edu.uc.cs3003.medava;

public class Pharmacy {

  public Pharmacy(String pharmacyName) {
    mPharmacyName = pharmacyName;
  }

  public boolean send(Transporter t) {
    Medicine advil = new Ibuprofen();
    if (t.load(advil)) {
      System.out.printf("Sending %s on the %s transporter.%n", advil.getMedicineName(),
          t.getTransporterName());
    } else {
      System.out.printf("Can't load %s oto the %s transporter.%n", advil.getMedicineName(),
          t.getTransporterName());
      return false;
    }

    Medicine activase = new Thrombolytic();
    if (t.load(activase)) {
      System.out.printf("Sending %s on the %s transporter.%n", activase.getMedicineName(),
          t.getTransporterName());
    } else {
      System.out.printf("Cannot load %s onto the %s transporter.%n", activase.getMedicineName(),
          t.getTransporterName());
      return false;
    }

    Medicine oxycontin = new Oxycodone();
    if (t.load(oxycontin)) {
      System.out.printf("Sending %s on the %s transporter.%n", oxycontin.getMedicineName(),
          t.getTransporterName());
    } else {
      System.out.printf("Cannot load %s onto the %s transporter.%n", oxycontin.getMedicineName(),
          t.getTransporterName());
      return false;
    }

    Jarvik heart = new Jarvik("01j9a9lk71");
    if (t.load(heart)) {
      System.out.printf("Sending %s on the %s transporter.%n", heart.getMedicineName(),
          t.getTransporterName());
    } else {
      System.out.printf("Cannot load %s onto the %s transporter.%n", heart.getMedicineName(),
          t.getTransporterName());
      return false;
    }

    return true;
  }

  public String pharmacyName() {
    return mPharmacyName;
  }

  private String mPharmacyName;
}
