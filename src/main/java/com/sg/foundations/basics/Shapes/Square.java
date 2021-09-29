/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.Shapes;


public class Square extends Shape {
    
    private double width;

    public Square(double width) {
        this.width = width;
    }
    
    
     @Override
    public double area() {
        // A = w * l
        return width * width;
    }

    @Override
    public double perimeter() {
        // P = 2(w + l)
        return 4* (width);
    }
    
}
