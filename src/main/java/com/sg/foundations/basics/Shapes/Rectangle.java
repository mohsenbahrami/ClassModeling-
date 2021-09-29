/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.Shapes;

/**
 *
 * @author bafsharim
 */
public class Rectangle extends Shape {
    
    private double width, length;
    
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
     @Override
    public double area() {
        // A = w * l
        return width * length;
    }

    @Override
    public double perimeter() {
        // P = 2(w + l)
        return 2 * (width + length);
    }
    
    
}
