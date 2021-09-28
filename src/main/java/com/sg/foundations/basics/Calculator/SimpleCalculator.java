/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.Calculator;

import java.util.Scanner;

public class SimpleCalculator {

    public double addition(double i, double j) {

        double total = i + j;
        return total;
    }

    public double subtraction(double i, double j) {
        double total = i - j;
        return total;
    }

    public double multiplication(double i, double j) {

        double total = i * j;
        return total;
    }

    public double division(double i, double j) {
        double total = i / j;
        return total;
    }

    public void welcome() {
        System.out.println("OOOOOOOOOOOOO    WELCOME  OOOOOOOOOOOOOOOOO");
    }

    public void bye() {
        System.out.println(" Thank you for useing my CALCULATOR ");
        System.out.println(" HAVE  A NICE DAY ");
    }

    public double num1() {
        System.out.println("Enter the firat number !");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        double num1 = Double.parseDouble(str);
        return num1;
    }

    public double num2() {
        System.out.println("Enter the second number!!");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        double num1 = Double.parseDouble(str);
        return num1;
    }

    public int choice() {
        System.out.println("1 - Addition ");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int choice = Integer.parseInt(str);
        return choice;

    }

    public int cal() {
        System.out.println(" ");
        return 0;
    }

    public boolean displayResult(double num1, double num2, double temp, int operator) {
        String str = "";
        boolean exist = true;

        if (operator == 1) {
            str = " + ";
        } else if (operator == 2) {
            str = " - ";
        } else if (operator == 3) {
            str = " * ";
        } else {
            str = " / ";
        }

        System.out.println(num1 + str + num2 + " = " + temp);

        System.out.println(" To Exit Press Q");
        Scanner sc = new Scanner(System.in);
        String exit = sc.nextLine();
        if (exit.equalsIgnoreCase("Q")) {
            return exist = false;
        }
        return exist;
    }
    public double calculator(){
        SimpleCalculator calculator = new SimpleCalculator ();
        Scanner sc =  new Scanner(System.in);
        boolean exist = true;
        double num1 = 0;
        double num2 = 0;
        double temp = 0;
        int opertion  = 0;
        
        calculator.welcome();
        while(exist){
            num1= calculator.num1();
            opertion = calculator.choice();
            if(opertion == 1){
                num2 = calculator.num2();
               temp = calculator.addition(num1, num2);
                exist =  calculator.displayResult(num1, num2, temp, opertion);   
            }else if(opertion == 2){
                num2 = calculator.num2();
                temp = calculator.subtraction(num1, num2);
                exist =  calculator.displayResult(num1, num2, temp, opertion);
            }else if(opertion == 3){
                num2 = calculator.num2();
                temp = calculator.multiplication(num1, num2);
               exist = calculator.displayResult(num1, num2, temp, opertion); 
            }else{
                num2 = calculator.num2();
                temp = calculator.division(num1, num2);
                exist = calculator.displayResult(num1, num2, temp, opertion); 
            }
        }
        
        return  temp;
    }
}
