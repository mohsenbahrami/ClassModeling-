/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.methods;

/**
 *
 * @author bafsharim
 */
public class BarelyControlledChaos {
    public static void main(String[] args) {

       String color = color(); // call color method here
        String animal = animal(); // call animal method again here
        String colorAgain = colorAgain(); // call color method again here
        int weight = weight(); // call number method,
            // with a range between 5 - 200
       int distance = distance(); // call number method,
            // with a range between 10 - 20
        int number = number(); // call number method,
            // with a range between 10000 - 20000
        int time = time(); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

     public static String color(){
       String str = "magenta";
       return str;
     }
    public static String animal(){
        String str = "mammoth";
        return str;
    }
   public static String colorAgain(){
       String str = "periwinkle";
       return str;
   }
   public static int weight(){
       int i = 80;
       return i;
   }
   public static int distance(){
       int i =12;
       return i;
   }
   public static int number(){
       int i = 4593;
       return i;
   }
   public static int time(){
       int i = 3;
       return i;
   }
}
