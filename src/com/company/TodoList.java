package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    Scanner scan = new Scanner(System.in);
    Scanner intScan = new Scanner(System.in);

    ArrayList<Todo> tasks = new ArrayList<>();
    ArrayList<Todo> marks = new ArrayList<>();

    void addTodo() {
        Todo task = new Todo();

        System.out.println("Add task");
        System.out.println("Please provide task description");
        task.description = scan.nextLine();

        System.out.println("Please provide task id: ");
        task.id = scan.nextInt();
        task.description1 = scan.nextLine(); // Added second description as a workaround - first after scan.nextInt does not work properly

        this.tasks.add(task);
        System.out.println("Task " + task.id + " added successfully!");
    }

    void viewAllTodo() {

        System.out.println("View all tasks: ");

        for (Todo task : tasks) {
            System.out.println("☐ " + task.id + ". " + task.description + task.description1);
        }
            for (Todo mark : marks){
                System.out.println("☑ " + mark.id + ". " + mark.description + mark.description1);
            }
        }

        void viewSingleTodo () {
            System.out.println("View single task by index");
            System.out.println("Enter index of task you want to view: ");

            int index = intScan.nextInt();
            Todo task = tasks.get(index);
            System.out.println(task.id + ". " + task.description);
        }

        void markTodoAsDone () {

            Todo mark = new Todo();

            System.out.println("Mark task as done");
            System.out.println("Enter index of task you want to mark as done: ");

            int index = intScan.nextInt();

            Todo task = tasks.get(index);
            System.out.println("☑ " + task.id + ". " + task.description + task.description1);

            tasks.remove(index);

            this.marks.add(mark);
            mark.id = task.id;
            mark.description = task.description;
            mark.description1 = task.description1;
        }
        void deleteTodo () {
            System.out.println("Remove task with particular index");
            System.out.println("Please input index of task you want to remove");

            int index = intScan.nextInt();
            tasks.remove(index);

            System.out.println("Task removed successfully!");
        }
    }

