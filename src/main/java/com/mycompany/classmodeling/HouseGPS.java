/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classmodeling;

public class HouseGPS {
    private int postalCode;
    private long x ;
    private long y;
    private long z;
    private String city;
    private String province;
    private String country = "Canada";

    public HouseGPS(int postalCode, long x, long y, long z, String city, String province, String country) {
        this.postalCode = postalCode;
        this.x = x;
        this.y = y;
        this.z = z;
        this.city = city;
        this.province = province;
        this.country = country;
    }
    public String houseLocation(String str){
        str = " Your house is locate in Canada";
        
        return str;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public long getX() {
        return x;
    }

    public void setX(long x) {
        this.x = x;
    }

    public long getY() {
        return y;
    }

    public void setY(long y) {
        this.y = y;
    }

    public long getZ() {
        return z;
    }

    public void setZ(long z) {
        this.z = z;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }  
    
}
