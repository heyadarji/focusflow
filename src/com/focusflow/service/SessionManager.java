package com.focusflow.service;

import com.focusflow.model.Session;
import java.util.ArrayList;

public class SessionManager {

    private ArrayList<Session> sessions;

    public SessionManager() {
        sessions = new ArrayList<>();
    }

    public void addSession(Session session) {
        sessions.add(session);
    }

    public void displayAllSessions() {
        for (Session s : sessions) {
            System.out.println("------------------");
            s.displaySession();
        }
    }

    public int getTotalFocusTime() {
        int total = 0;

        for (Session s : sessions) {
            total += s.getDurationMinutes();
        }

        return total;
    }
    
}
