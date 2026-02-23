package org.codedifferently;

import java.util.ArrayList;

public class BryantClinicSystem {

    private ArrayList<KennyPatient> patients;
    private ArrayList<KennyPatient> waitingList;
    private ArrayList<MesheikAppointment> appointments;
    private String[] dailyTimeSlots = {"9:00AM", "10:00AM", "11:00AM", "1:00PM", "2:00PM", "3:00PM"};

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

    public boolean isValidTime(String time) {
        for (String slot : dailyTimeSlots) {
            if (slot.equalsIgnoreCase(time)) {
                return true;
            }
        }
        return false;
    }

    public void scheduleAppointment(String date, String time, String reason) {
        // checks for bad input
        if (date == null || date.isEmpty() ||
                time == null || time.isEmpty() ||
                reason == null || reason.isEmpty()) {
            System.out.println("Invalid input. All fields are required to schedule an appointment.");
            return;
        }

        // Validate time exists in daily schedule
        if (!isValidTime(time)) {
            System.out.println("Invalid time slot.");
            return;
        }

        // Prevent double booking
        for (MesheikAppointment appointment : appointments) {
            if (appointment.getDate().equals(date) && appointment.getTime().equalsIgnoreCase(time)) {
                System.out.println("That time slot is already booked on this date.");
                return;
            }
        }

        // If the appointment is valid and not booked, schedule the appointment
        MesheikAppointment newAppointment = new MesheikAppointment(date, time, reason);
        appointments.add(newAppointment);
        System.out.println("Appointment scheduled successfully.");
    }

    public void viewFullSchedule() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments are scheduled.");
            return;
        }

        for (MesheikAppointment appointment : appointments) {
            System.out.println("Date: " + appointment.getDate());
            System.out.println("Time: " + appointment.getTime());
            System.out.println("Reason: " + appointment.getReason());
            System.out.println("---------------------------");
        }
    }

    public void cancelAppointment(String date, String time) {
        for (int i = 0; i < appointments.size(); i++) {
            MesheikAppointment appointment = appointments.get(i);
            if (appointment.getDate().equals(date) && appointment.getTime().equalsIgnoreCase(time)) {
                if (appointment.isCompleted()) {
                    System.out.println("Cannot cancel a completed appointment.");
                    return;
                }
                appointments.remove(i);
                System.out.println("The Appointment was cancelled.");
                return;
            }
        }
        System.out.println("Appointment not found.");
    }

    public void completeAppointment(String date, String time) {
        for (MesheikAppointment appointment : appointments) {
            if (appointment.getDate().equals(date) && appointment.getTime().equalsIgnoreCase(time)) {
                if (appointment.isCompleted()) {
                    System.out.println("Appointment already completed.");
                    return;
                }
                appointment.markCompleted();
                System.out.println("Appointment marked as completed.");
                return;
            }
        }

        System.out.println("Appointment not found.");
    }


    public void addedToWaitingList(KennyPatient patient) {
        waitingList.add(patient);
        System.out.println("Patient added to waiting list.");
    }

    public void viewWaitList() {
        if (waitingList.isEmpty()) {
            System.out.println("Waitlist is empty.");
            return;
        }
        System.out.println("---- Waiting List ----");
        for (KennyPatient patient : waitingList) {
            patient.displayInfo();
        }
    }


    public void addPatient(KennyPatient patient){
        patients.add(patient);
    }

    public void viewAllPatients(){
        for (KennyPatient patient : patients) {
            patient.displayInfo();
        }
    }

    public void lookUpPatient(String name, String phoneNumber){
        for (KennyPatient patient : patients) {
            if (name.equals(patient.getName()) && phoneNumber.equals(patient.getOwnersPhoneNumber())) {
                patient.displayInfo();
            }
        }
    }

    public void lookUpPatientById(int id){
        for (KennyPatient patient : patients) {
            if (patient.getPatientId() == id) {
                patient.displayInfo();
                return;   //exits the method early
            }
        }
        System.out.println("Patient not found.");
    }

    public void checkInPatient(KennyPatient patient) {
        if (patient.isCheckedIn()) {
            System.out.println("Patient already checked in.");
            return;
        }

        patient.setCheckedIn(true);
        System.out.println("Patient checked in successfully.");
    }

    public void dailySummary(String date) {
        int total=0, completed=0, pending=0;

        for (MesheikAppointment appointment : appointments) {
            if (appointment.getDate().equals(date)) {
                total++;

                if (appointment.isCompleted()) {
                    completed++;
                } else {
                    pending++;
                }
            }
        }

        System.out.println("----- Daily Summary for " + date + " -----");
        System.out.println("Total Appointments: " + total);
        System.out.println("Completed Appointments: " + completed);
        System.out.println("Pending Appointments: " + pending);
    }

}// ends class
