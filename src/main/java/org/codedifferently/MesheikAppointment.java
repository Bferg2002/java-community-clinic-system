package org.codedifferently;

// This class represents one appointment
public class MesheikAppointment {

    //Setting our appointment variables up
    private String date;
    private String time;
    private String reason;
    private boolean completed;

    // Constructor runs when an appointment is created
    public MesheikAppointment(String date, String time, String reason){
        this.date = date;
        this.time = time;
        this.reason = reason;
        this.completed = false;
    }

    //Getters: how we get our appointments
    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getReason() {
        return reason;
    }

    public boolean isCompleted() {
        return completed;
    }


    //Setters: How we change or update our appointments
    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void markCompleted() {
        this.completed = true;
    }


}//ends class
