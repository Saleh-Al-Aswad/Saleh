package com.capgemini;

public class reservationList {
    private String id;
    private String BoatType;
    private String Date;
    private String Time;

    public void setID(String id) { this.id = id; }
    public void setBoatType(String BoatType) { this.BoatType = BoatType; }
    public void setDate(String Date) { this.Date = Date; }
    public void setTime(String Time) { this.Time = Time; }
    
    // Optionally, add getters or a constructor
    
    public String getID(String id) { return id; }
    public String getBoatType(String BoatType) { return BoatType; }
    public String getDate(String Date) { return Date; }
    public String getTime(String Time) { return Time; }

}
