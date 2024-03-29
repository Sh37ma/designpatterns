package com.example.designpatterns.behavioralpatterns.command;

import java.util.Stack;

public class CommandHistory {
    private Stack<Command> history;

    public CommandHistory() {
        this.history = new Stack<>();
    }

    public void push(Command command) {
        history.push(command);
    }

    public Command pop() {
        return history.pop();
    }
}


