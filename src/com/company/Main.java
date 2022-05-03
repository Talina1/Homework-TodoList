package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to Todo app");

        TodoList tl = new TodoList();
        Scanner scan = new Scanner(System.in);

        String userInput = "";
        do{
            System.out.println("Please choose activity: ");
            System.out.println("""
                    1. Add Todo
                    2. View all Todos
                    3. View single todo
                    4. Mark Todo as done
                    5. Delete Todo
                    "quit" - for end menu.
                    """);
            userInput = scan.nextLine();
            switch (userInput){
                case "quit":
                    System.out.println("Exiting application.");
                    break;
                case "1":
                    tl.addTodo();
                    break;
                case "2":
                    tl.viewAllTodo();
                    break;
                case "3":
                    tl.viewSingleTodo();
                    break;
                case "4":
                    tl.markTodoAsDone();
                    break;
                case "5":
                    tl.deleteTodo();
                    break;
                default:
                    System.out.println("Please provide a valid input!");
            }
        } while (!userInput.equalsIgnoreCase("quit"));

    }
}
