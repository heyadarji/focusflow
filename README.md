# FocusFlow Java Tracker

FocusFlow is a consile-based Java application that helps users track their focus

## Features
- Add focus sessions
- View all recorded sessions
- Calculate total focus time
- Store sessions in a file

## Project Structure

```
focusflow-java-tracker
│
├── sessions.txt
│
└── src
    └── com
        └── focusflow
            ├── Main.java
            ├── model
            │     └── Session.java
            ├── service
            │     └── SessionManager.java
            └── util
                  └── FileStorage.java
```

## Technologies Used
- Java
- Object Oriented Programming
- ArrayList Collections
- File Handling
- Console Input (Scanner)

## Project Structure
src/com/focusflow

Main.java - application entry point
Session.java - session model
SessionManager.java - session management logic
FileStorage.java - file persistence

## How to Run

Complie the program:
javac com/focusflow/Main.java

## Example Output

```
Welcome to FocusFlow Productivity Tracker

1. Add Focus Session
2. View All Sessions
3. Show Total Focus Time
4. Exit
```

## Future Improvements

- Load sessions from file at startup
- Add session deletion
- Add search functionality
- Convert to GUI using JavaFX
- Store sessions in a database
Run the program:
java com.focusflow.Main
