package edu.uc.cs3003.medava;

public class HospitalRunner {

  public static void run() {
    Transporter priorityDispatch = new Transporter("Priority Dispatch", 40.0, 41.0);
    Pharmacy cvs = new Pharmacy("CVS @ 17 William Howard Taft Rd");
    cvs.send(priorityDispatch);
    Hospital uc = new Hospital("University of Cincinnati Children's Hospital");
    uc.receive(priorityDispatch);
  }
}
