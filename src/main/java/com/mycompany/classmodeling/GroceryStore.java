/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classmodeling;

/**
 *
 * @author bafsharim
 */
public class GroceryStore {

    private int numberOfScoops;
    private String flavor;
    private String typeOfCone;
    private String toppings[];

    public GroceryStore(int numberOfScoops, String flavor, String typeOfCone, String[] toppings) {
        this.numberOfScoops = numberOfScoops;
        this.flavor = flavor;
        this.typeOfCone = typeOfCone;
        this.toppings = toppings;
    }

    public int getNumberOfScoops() {
        return numberOfScoops;
    }

    public void setNumberOfScoops(int numberOfScoops) {
        this.numberOfScoops = numberOfScoops;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getTypeOfCone() {
        return typeOfCone;
    }

    public void setTypeOfCone(String typeOfCone) {
        this.typeOfCone = typeOfCone;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }
    
}
