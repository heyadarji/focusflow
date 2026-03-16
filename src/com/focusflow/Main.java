package com.focusflow;

import com.focusflow.model.Session;
import com.focusflow.service.SessionManager;
import com.focusflow.util.FileStorage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        SessionManager manager = new SessionManager();

        boolean running = true;

        System.out.println("Welcome to FocusFlow Productivity Tracker");

        while (running) {

            System.out.println("\n-------------------------");
            System.out.println("1. Add Focus Session");
            System.out.println("2. View All Sessions");
            System.out.println("3. Show Total Focus Time");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter task name: ");
                    String task = scanner.nextLine();

                    System.out.print("Enter duration (minutes): ");
                    int duration = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter date: ");
                    String date = scanner.nextLine();

                    Session session = new Session(task, duration, date);
                    manager.addSession(session);

                    FileStorage.saveSession(session);

                    System.out.println("Session added successfully!");
                    break;

                case 2:
                    System.out.println("\nYour Focus Sessions:");
                    manager.displayAllSessions();
                    break;

                case 3:
                    System.out.println("Total Focus Time: " + manager.getTotalFocusTime() + " minutes");
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting FocusFlow. Stay productive!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
