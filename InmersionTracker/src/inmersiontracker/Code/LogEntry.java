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
    private final double hours;
    private final String description;

    public LogEntry(double hours, String description) {
        this.hours = hours;
        this.description = description;
    }

    @Override
    public String toString() {
        return hours + " hours - " + description;
    }
}
