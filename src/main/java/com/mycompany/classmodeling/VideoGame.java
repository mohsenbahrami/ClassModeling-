/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classmodeling;

/**
 *
 * @author bafsharim
 */
public class VideoGame {
    
    private String name;
    private int speed;
    private int location;
    private static int length = 1000;
    private static int minSpeedForAll = 0;
    private static int maxSpeedForAll = 120;

    public VideoGame(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public static int getLength() {
        return length;
    }

    public static void setLength(int length) {
        VideoGame.length = length;
    }

    public static int getMinSpeedForAll() {
        return minSpeedForAll;
    }

    public static void setMinSpeedForAll(int minSpeedForAll) {
        VideoGame.minSpeedForAll = minSpeedForAll;
    }

    public static int getMaxSpeedForAll() {
        return maxSpeedForAll;
    }

    public static void setMaxSpeedForAll(int maxSpeedForAll) {
        VideoGame.maxSpeedForAll = maxSpeedForAll;
    }
    
    
}
