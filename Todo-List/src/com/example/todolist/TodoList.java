package com.example.todolist;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String taskName) {
        Task task = new Task(taskName);
        tasks.add(task);
    }

    public boolean removeTask(String taskName) {
        for (Task task : tasks) {
            if (task.getName().equals(taskName)) {
                tasks.remove(task);
                return true;
            }
        }
        return false;
    }

    public void viewTasks() {
        for (Task task : tasks) {
            System.out.println(task.getName() + " - " + (task.isComplete() ? "Complete" : "Incomplete"));
        }
    }

    public boolean markTaskComplete(String taskName) {
        for (Task task : tasks) {
            if (task.getName().equals(taskName)) {
                task.setComplete(true);
                return true;
            }
        }
        return false;
    }

    public void viewCompletedTasks() {
        for (Task task : tasks) {
            if (task.isComplete()) {
                System.out.println(task.getName());
            }
        }
    }
}