/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.JavaWriteFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author bafsharim
 */
public class StateCapitals2 {

    private final static String DELIMITER = "::";
    private final static String FILE = "StateCapitals.txt";

    public static void main(String[] args) throws IOException {

        State s = new State();
        Map<String, String> state = new HashMap<String, String>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {
                String[] splitedLine = strLine.split(DELIMITER);
                state.put(splitedLine[0], splitedLine[1]);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println(state.size() + " STATES & CAPITALS ARE LOADED.");
        System.out.println("=====================================");
        System.out.println("HERE ARE THE STATES :");

        Set<String> keys = state.keySet();
        for (String k : keys) {
            System.out.print(keys + " , ");
        }
        System.out.println("");
        
        int low = 0;
        int high = state.size(); 
        List<String> list = new ArrayList(state.keySet());

        System.out.println("How many times do you want to guess?");
        Scanner sc = new Scanner(System.in);
        int guessNum = Integer.parseInt(sc.nextLine());
        int point = 0;
        for (int i = 0; i < guessNum; i++) {
            Random r = new Random();
            int randNum = r.nextInt(high - low) + low;
            String randKey = list.get(randNum);
            System.out.println("READY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF '" + randKey + "'?");
            String str = sc.nextLine();
            String val = state.get(randKey);
            if (val.equalsIgnoreCase(str)) {
                point++;
                System.out.println("NICE WORK! " + val + " IS CORRECT!");
            } else {
                if (point > 0) {
                    point--;
                }
                System.out.println(" May be next time!!" + val + " IS CORRECT!");
            }
        }
        System.out.println("YOUR TOTAL POINTS IS: " + point);
    }
}
