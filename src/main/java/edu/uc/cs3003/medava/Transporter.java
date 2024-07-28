package edu.uc.cs3003.medava;

import java.util.ArrayList;
import java.util.List;

public class Transporter {

  private String mTransporterName;
  private List<Shippable> goods = new ArrayList<>();
  private double mLowTemperature, mHighTemperature;

  public Transporter(String transporterName, double lowTemp, double highTemp) {
    this.mTransporterName = transporterName;
    this.mLowTemperature = lowTemp;
    this.mHighTemperature = highTemp;
  }


  public String getTransporterName() {
    return mTransporterName;
  }

  public Shippable unload() {
    return goods.remove(0);
  }

  public boolean load(Shippable itemToLoad) {
    if (itemToLoad.isTemperatureRangeAcceptable(mLowTemperature, mHighTemperature)) {
      return goods.add(itemToLoad);
    }
    return false;
  }

  public boolean isEmpty() {
    return goods.isEmpty();
  }
}
