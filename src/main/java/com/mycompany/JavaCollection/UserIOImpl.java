/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.JavaCollection;

import java.util.Scanner;

/**
 *
 * @author bafsharim
 */
public class UserIOImpl implements UserIO {

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        return str;
    }

    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        int i = Integer.parseInt(sc.nextLine());
        return i;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        int rounds;
        do {
            System.out.println(  prompt + " "+ min +" to" + max);
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next();
            }
            rounds = sc.nextInt();
        } while (rounds < min || rounds >= max);

        return rounds;
    }

    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        double d = Double.parseDouble(sc.nextLine());
        return d;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        double rounds;
        do {
            System.out.println(  prompt + " "+ min +" to" + max);
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next();
            }
            rounds = sc.nextInt();
        } while (rounds < min || rounds >= max);

        return rounds;
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        float f = Float. parseFloat(sc.nextLine());
        return f;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
          System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        float rounds;
        do {
            System.out.println(  prompt + " "+ min +" to" + max);
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next();
            }
            rounds = sc.nextInt();
        } while (rounds < min || rounds >= max);

        return rounds;
    }

    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        long l = Long. parseLong(sc.nextLine());
        return l;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        long rounds;
        do {
            System.out.println(  prompt + " "+ min +" to" + max);
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next();
            }
            rounds = sc.nextInt();
        } while (rounds < min || rounds >= max);

        return rounds;
    }

}
