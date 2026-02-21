package org.codedifferently;

public class MesheikAppointment {

    //Setting our variables up
    private String date;
    private String time;
    private String reason;

    public MesheikAppointment(String date, String time, String reason){
        this.date = date;
        this.time = time;
        this.reason = reason;
    }

    //Getters
    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getReason() {
        return reason;
    }


    //Setters
    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}//ends class
