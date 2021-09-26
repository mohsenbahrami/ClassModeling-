/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classmodeling;


public class House3D {
    public double area;
    public int kitchenCabinets;
    public int kitchenSize;
    public String kitchenShap;
    public boolean renovate;
    public boolean backyard;
    public double wallLength;

    public House3D(double area, int kitchenCabinets, int kitchenSize, String kitchenShap, boolean renovate, boolean backyard, double wallLength) {
        this.area = area;
        this.kitchenCabinets = kitchenCabinets;
        this.kitchenSize = kitchenSize;
        this.kitchenShap = kitchenShap;
        this.renovate = renovate;
        this.backyard = backyard;
        this.wallLength = wallLength;
    }
    
    public int kitchenSize(int i, int j, int z){
    int size = i+ j+z;
    return size;
}


    
    
    
}
