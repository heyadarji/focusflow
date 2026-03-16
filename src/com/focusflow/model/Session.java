package com.focusflow.model;

public class Session {
    
    private String taskName;
    private int durationMinutes;
    private String date;

    public Session(String taskName, int durationMinutes, String date) {
        this.taskName = taskName;
        this.durationMinutes = durationMinutes;
        this.date = date;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public String getDate() {
        return date;
    }

    public void displaySession() {
        System.out.println("Task: " + taskName);
        System.out.println("Duration: " + durationMinutes + " minutes");
        System.out.println("Date: " + date);
    }
}
