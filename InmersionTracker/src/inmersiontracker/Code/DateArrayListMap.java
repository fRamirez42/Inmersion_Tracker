/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmersiontracker.Code;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author felip
 */
public class DateArrayListMap {
    private HashMap<Date, ArrayList<String>> map;

    // Constructor to initialize the HashMap
    public DateArrayListMap() {
        this.map = new HashMap<>();
    }

    // Method to add an element to the ArrayList for a specific date
    public void addElement(Date date, ArrayList element) {
        map.putIfAbsent(date, new ArrayList<>());
//        map.get(date).add(element);
    }

    // Method to retrieve the ArrayList for a specific date
    public ArrayList<String> getElements(Date date) {
        return map.getOrDefault(date, new ArrayList<>());
    }

    // Method to check if a date exists in the map
    public boolean containsDate(Date date) {
        return map.containsKey(date);
    }

    // Method to remove a date from the map
    public void removeDate(Date date) {
        map.remove(date);
    }

    // Method to clear all entries from the map
    public void clear() {
        map.clear();
    }

    // Method to display all entries in the map
    public void printAllEntries() {
        for (Map.Entry<Date, ArrayList<String>> entry : map.entrySet()) {
            System.out.println("Date: " + entry.getKey());
            System.out.println("Entries: " + entry.getValue());
        }
    }
}
