package org.example;

import java.util.Scanner;

public class ExpensesApp {

    public void start(){

        Scanner scanner = new Scanner(System.in);
        ExpenseManager expenseManager = new ExpenseManager();


        while(true){
            System.out.println("1. Wyświetl wszystkie wydatki");
            System.out.println("2. Wyświetl wydatki z wybranego miesiąca");
            System.out.println("3. Dodaj wydatek");
            System.out.println("4. Zakończ aplikację");
            System.out.println("Wybierz opcję: ");


            int choice = Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 1 -> expenseManager.displayAllExpenses();
                case 2 -> expenseManager.displayMonthlyExpenses(scanner);
                case 3 -> expenseManager.addExpense(scanner);
                case 4 -> {
                    System.out.println("Zakończono aplikację :) ");
                    scanner.close();
                    System.exit(0);
                }
            }
        }
    }
}
