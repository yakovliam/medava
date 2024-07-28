package edu.uc.cs3003.medava;

public class Hospital {

  private final String name;

  public Hospital(String hospitalName) {
    this.name = hospitalName;
  }

  public void receive(Transporter t) {
    while (!t.isEmpty()) {
      Shippable unloaded = t.unload();
      System.out.printf("Checking if hospital can receive %s.%n", unloaded.getMedicineName());
      if (unloaded.getSchedule() != MedicineSchedule.Uncontrolled) {
        System.out.printf("Hospital can't receive controlled substances and %s is a %s.%n",
            unloaded.getMedicineName(), unloaded.getSchedule().asString());
      } else {
        System.out.printf("Hospital accepted a shipment of %s.%n", unloaded.getMedicineName());
      }
    }
  }

  public String getName() {
    return name;
  }
}
