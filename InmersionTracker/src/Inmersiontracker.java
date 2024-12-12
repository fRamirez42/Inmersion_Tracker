/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import inmersiontracker.Code.LogEntry;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author felip
 */
public class Inmersiontracker {
    private final HashMap<LocalDate, ArrayList<LogEntry>> immersionLog = new HashMap<>();

    // Add log entry for a date
    public void addLog(LocalDate date, double hours, String description) {
        immersionLog.computeIfAbsent(date, k -> new ArrayList<>())
                    .add(new LogEntry(hours, description));
    }

    // Retrieve logs for a specific date
    public List<LogEntry> getLogsForDate(LocalDate date) {
        return immersionLog.getOrDefault(date, new ArrayList<>());
    }

    // Display all logs
    public void displayAllLogs() {
        immersionLog.forEach((date, logs) -> {
            System.out.println(date + ":");
            logs.forEach(System.out::println);
        });
    }

}
