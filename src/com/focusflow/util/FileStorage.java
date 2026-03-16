package com.focusflow.util;

import com.focusflow.model.Session;
import java.io.FileWriter;
import java.io.IOException;

public class FileStorage {

    public static void saveSession(Session session) {

        try {
            FileWriter writer = new FileWriter("sessions.txt", true);

            String data = session.getTaskName() + "," +
                          session.getDurationMinutes() + "," +
                          session.getDate() + "\n";
                        
            writer.write(data);
            
            writer.close();

        } catch (IOException e) {
            System.out.println("Error saving session.");
        }
    }
    
}
