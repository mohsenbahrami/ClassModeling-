/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classmodeling;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author bafsharim
 */
public class TrafficControlSystem {
     LocalDate date = LocalDate.now();
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
    
    private double area;
    private int stopSignNumber;
    private String dTime = date.format(formatter);
    private int passengerNimber;
    private int flightNumberPerHour;

    public TrafficControlSystem(double area, int stopSignNumber, int passengerNimber, int flightNumberPerHour) {
        this.area = area;
        this.stopSignNumber = stopSignNumber;
        this.passengerNimber = passengerNimber;
        this.flightNumberPerHour = flightNumberPerHour;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getStopSignNumber() {
        return stopSignNumber;
    }

    public void setStopSignNumber(int stopSignNumber) {
        this.stopSignNumber = stopSignNumber;
    }

    public String getdTime() {
        return dTime;
    }

    public void setdTime(String dTime) {
        this.dTime = dTime;
    }

    public int getPassengerNimber() {
        return passengerNimber;
    }

    public void setPassengerNimber(int passengerNimber) {
        this.passengerNimber = passengerNimber;
    }

    public int getFlightNumberPerHour() {
        return flightNumberPerHour;
    }

    public void setFlightNumberPerHour(int flightNumberPerHour) {
        this.flightNumberPerHour = flightNumberPerHour;
    }
    
    
    
}
