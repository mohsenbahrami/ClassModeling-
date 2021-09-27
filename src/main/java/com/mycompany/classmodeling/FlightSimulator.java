/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classmodeling;

/**
 *
 * @author bafsharim
 */
public class FlightSimulator {
   private long cordinateX ;
   private long cordinateY ;
   private long cordinateZ ;
   private float empty_weight;
   private float max_gross_weight;
   private boolean activate_mach_limit_based_on_cg;
   private boolean activate_cg_limit_based_on_mach;
   private int max_number_of_stations;

    public FlightSimulator(long cordinateX, long cordinateY, long cordinateZ, float empty_weight, float max_gross_weight, boolean activate_mach_limit_based_on_cg, boolean activate_cg_limit_based_on_mach, int max_number_of_stations) {
        this.cordinateX = cordinateX;
        this.cordinateY = cordinateY;
        this.cordinateZ = cordinateZ;
        this.empty_weight = empty_weight;
        this.max_gross_weight = max_gross_weight;
        this.activate_mach_limit_based_on_cg = activate_mach_limit_based_on_cg;
        this.activate_cg_limit_based_on_mach = activate_cg_limit_based_on_mach;
        this.max_number_of_stations = max_number_of_stations;
    }

    public FlightSimulator() {
    }

    public long getCordinateX() {
        return cordinateX;
    }

    public void setCordinateX(long cordinateX) {
        this.cordinateX = cordinateX;
    }

    public long getCordinateY() {
        return cordinateY;
    }

    public void setCordinateY(long cordinateY) {
        this.cordinateY = cordinateY;
    }

    public long getCordinateZ() {
        return cordinateZ;
    }

    public void setCordinateZ(long cordinateZ) {
        this.cordinateZ = cordinateZ;
    }

    public float getEmpty_weight() {
        return empty_weight;
    }

    public void setEmpty_weight(float empty_weight) {
        this.empty_weight = empty_weight;
    }

    public float getMax_gross_weight() {
        return max_gross_weight;
    }

    public void setMax_gross_weight(float max_gross_weight) {
        this.max_gross_weight = max_gross_weight;
    }

    public boolean isActivate_mach_limit_based_on_cg() {
        return activate_mach_limit_based_on_cg;
    }

    public void setActivate_mach_limit_based_on_cg(boolean activate_mach_limit_based_on_cg) {
        this.activate_mach_limit_based_on_cg = activate_mach_limit_based_on_cg;
    }

    public boolean isActivate_cg_limit_based_on_mach() {
        return activate_cg_limit_based_on_mach;
    }

    public void setActivate_cg_limit_based_on_mach(boolean activate_cg_limit_based_on_mach) {
        this.activate_cg_limit_based_on_mach = activate_cg_limit_based_on_mach;
    }

    public int getMax_number_of_stations() {
        return max_number_of_stations;
    }

    public void setMax_number_of_stations(int max_number_of_stations) {
        this.max_number_of_stations = max_number_of_stations;
    }
   
   
}
