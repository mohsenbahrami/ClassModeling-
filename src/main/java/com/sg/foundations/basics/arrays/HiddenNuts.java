/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.arrays;

import java.util.Random;

/**
 *
 * @author bafsharim
 */
public class HiddenNuts {
    public static void main(String[] args) {

        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        int x = squirrel.nextInt(hidingSpots.length);
       
        hidingSpots[x] = "Nut";
        System.out.println("The nut has been hidden ...");
        System.out.println("Found it! It's in spot#"+ x);

    }
}
