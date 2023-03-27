package com.example.todolist;

public class Task {
    private String name;
    private boolean complete;

    public Task(String name) {
        this.name = name;
        this.complete = false;
    }

    public String getName() {
        return name;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
