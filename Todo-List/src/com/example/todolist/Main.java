package com.example.todolist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
        	System.out.println("--------------------------------");
            System.out.println("Enter 1 to add task:");
            System.out.println("Enter 2 to remove task");
            System.out.println("Enter 3 to view all tasks");
            System.out.println("Enter 4 to mark a task complete");
            System.out.println("Enter 5 to view completed tasks");
            System.out.println("Enter 6 to exit");
            System.out.println("--------------------------------");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                	System.out.println("-------------------");
                    System.out.println("Enter task name:");
                    String taskName = scanner.nextLine();
                    todoList.addTask(taskName);
                    System.out.println("Task added.");
                    break;
                case 2:
                	System.out.println("-------------------");
                    System.out.println("Enter task name:"); 
                    String taskNameToRemove = scanner.nextLine();
                    boolean removed = todoList.removeTask(taskNameToRemove);
                    if (removed) {
                        System.out.println("Task removed.");
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;
                case 3:
                	System.out.println("-------------------");
                    System.out.println("All tasks:");
                    todoList.viewTasks();
                    break;
                case 4:
                	System.out.println("-------------------");
                    System.out.println("Enter task name:");
                    String taskNameToMarkComplete = scanner.nextLine();
                    boolean markedComplete = todoList.markTaskComplete(taskNameToMarkComplete);
                    if (markedComplete) {
                        System.out.println("Task marked complete.");
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;
                case 5:
                	System.out.println("-------------------");
                    System.out.println("Completed tasks:");
                    todoList.viewCompletedTasks();
                    break;
                case 6:
                	System.out.println("-------------------");
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                	System.out.println("-------------------");
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
