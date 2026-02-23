package org.codedifferently;

import java.util.ArrayList;

public class BryantClinicSystem {

    private ArrayList<KennyPatient> patients;
    private ArrayList<KennyPatient> waitingList;
    private ArrayList<MesheikAppointment> appointments;

    public BryantClinicSystem() {

        this.patients = new ArrayList<>();
        this.waitingList = new ArrayList<>();
        this.appointments = new ArrayList<>();

        // Preloaded patients
        KennyPatient p1 = new KennyPatient("Dog", "Buddy", false, "3025551111");
        KennyPatient p2 = new KennyPatient("Cat", "Luna", false, "3025552222");
        patients.add(p1);
        patients.add(p2);

        // Preloaded appointments
        MesheikAppointment a1 = new MesheikAppointment("12/10/2026", "9:00AM", "Checkup");
        MesheikAppointment a2 = new MesheikAppointment("12/10/2026", "10:00AM", "Vaccination");
        appointments.add(a1);
        appointments.add(a2);
    }

    public void scheduleAppointment(MesheikAppointment appointment) {
        appointments.add(appointment);
    }

    public void cancelAppointment(MesheikAppointment appointment) {
        appointments.remove(appointment);
    }

    public void addedToWaitingList(KennyPatient patient) {
        waitingList.add(patient);
    }

    public void viewAllPatients(){

    }

    public void lookUpPatient(){

    }


}
