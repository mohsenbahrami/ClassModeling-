/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.JavaCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author bafsharim
 */
public class StateCapitals {

    public static void main(String[] args) {

        Map<String, String> state = new HashMap<>();
        state.put("Alabama", "Montgomery");
        state.put("Alaska", "Juneau");
        state.put("Arizona", "Phoenix");
        state.put("Arkansas", "Little Rock");
        state.put("California", " Sacramento");
        state.put("Colorado", "Denver");
        state.put("Connecticut", " Hartford");
        state.put("Delaware", "Dover");
        state.put("Florida", "Tallahassee");
        state.put("Georgia", "Atlanta");
        state.put("Hawaii", "Honolulu");
        state.put("Idaho", "Boise");
        state.put("Illinois", "Springfield");
        state.put("Indiana", "Indianapolis");
        state.put("Iowa", "Des Moines");
        state.put("Kansas", "Topeka");
        state.put("Kentucky", "Frankfort");
        state.put("Louisiana", "Baton Rouge");
        state.put("Maine", "Augusta");
        state.put("Maryland", "Annapolis");
        state.put("Massachusetts", "Boston");
        state.put("Michigan", "Lansing");
        state.put("Minnesota", "St. Paul");
        state.put("Mississippi ", "Mississippi ");
        state.put("Missouri", "Jefferson City");
        state.put("Montana", "Helena");
        state.put("Nebraska", "Lincoln");
        state.put("Nevada", "Carson City");
        state.put("New Hampshire", "Concord");
        state.put("New Jersey", "Trenton");
        state.put("New Mexico", "Santa Fe");
        state.put("New York", "Albany");
        state.put("North Carolina", " Raleigh");
        state.put("North Dakota", "Bismarck");
        state.put("Ohio", "Columbus");
        state.put("Oklahoma", "Oklahoma City");
        state.put("Oregon", "Salem");
        state.put("Pennsylvania", "Harrisburg");
        state.put("Rhode Island", "Providence");
        state.put("South Carolina", "Columbia");
        state.put("South Dakota", " Pierre");
        state.put("Tennessee", "Nashville");
        state.put("Texas", "Austin");
        state.put("Utah", "Salt Lake City");
        state.put("Vermont", "Montpelier");
        state.put("Virginia", "Richmond");
        state.put("Washington", "Olympia");
        state.put("West Virginia", "Charleston");
        state.put("Wisconsin", "Madison");
        state.put("Wyoming", "Cheyenne");

        // get the Set of keys from the map
        Set<String> keys = state.keySet();
 System.out.println("STATE/CAPITAL PAIRS:");
        System.out.println("=========");
        System.out.println("");
        int count = 1;
        for (String s : keys) {

            System.out.println(count++ + ":" + s);
        }
        System.out.println("");
        System.out.println("STATES:");
        System.out.println("=========");
        System.out.println("");
        count = 1;
        for (String s : keys) {
            System.out.println(count++ + ":" + state.get(s));
        }
        System.out.println("");
        System.out.println("STATE/CAPITAL PAIRS:");
        System.out.println("=========");
        System.out.println("");
        count = 1;
        for(String s : keys){
            System.out.println(count++ + ":" + s  + " - " + state.get(s));
        }
        
    }

}
