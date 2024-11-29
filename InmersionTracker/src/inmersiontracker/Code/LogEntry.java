/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmersiontracker.Code;

/**
 *
 * @author felip
 */
public class LogEntry {
    private double hours;
    private String description;
    private String activity;

    public LogEntry(double hours, String description, String act) {
        this.hours = hours;
        this.description = description;
        this.activity = act;
    }

    @Override
    public String toString() {
        return hours + " hours - " + description;
    }
    
    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }
    
    public void setDescription(String desc) {
        this.description = desc;
    }

    public String getDescription() {
        return description;
    } 
    public void setActivity(String act) {
        this.activity = act;
    }

    public String getActivity() {
        return activity;
    }
}
