/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.JavaWriteFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author bafsharim
 */
public class StateCapitalsApp {

    private final static String DELIMITER = "::";
    private final static String FILE = "StateCapitals.txt";
    private final static String CAPITAL_FILE = "MoreStateCapitals.txt";

    public static void main(String[] args) {

        Map<String, List<String>> stateCapital = new HashMap<String, List<String>>();
        try (BufferedReader br = new BufferedReader(new FileReader(CAPITAL_FILE))) {
            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {
                String[] splitedLine = strLine.split(DELIMITER);
                stateCapital.put(splitedLine[0], Arrays.asList(splitedLine[1], splitedLine[2], splitedLine[3]));
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println(stateCapital.size() + " STATES & CAPITALS ARE LOADED.");
        System.out.println("=================================");

        Set<String> keys = stateCapital.keySet();
        for (String k : keys) {
            List<String> capitalsInfo = stateCapital.get(k);
            System.out.println(k + " - " + capitalsInfo.get(0) + " | Pop: " + capitalsInfo.get(1) + " | Area: " + capitalsInfo.get(2) + " sq mi");

        }

        System.out.println("Please enter the lower limit for capital city population: ");
        Scanner sc = new Scanner(System.in);
        int pop = Integer.parseInt(sc.nextLine());
        System.out.println("LISTING CAPITALS WITH POPULATIONS GREATER THAN " + pop + ":");
        for (String k : keys) {
            List<String> capitalsInfo = stateCapital.get(k);
            int population = Integer.parseInt(capitalsInfo.get(1));
            if (population > pop) {
                System.out.println(k + " - " + capitalsInfo.get(0) + " | Pop: " + capitalsInfo.get(1) + " | Area: " + capitalsInfo.get(2) + " sq mi");
            }
        }

        System.out.println("Please enter the upper limit for capital city sq mileage: ");
        double area = Double.parseDouble(sc.nextLine());
        System.out.println("LISTING CAPITALS WITH AREAS LESS THAN " + area + ":");
        for (String k : keys) {
            List<String> capitalsInfo = stateCapital.get(k);
            double a = Double.parseDouble(capitalsInfo.get(2));
            if (a < area) {
                System.out.println(k + " - " + capitalsInfo.get(0) + " | Pop: " + capitalsInfo.get(1) + " | Area: " + capitalsInfo.get(2) + " sq mi");
            }
        }
    }

}
