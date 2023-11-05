package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpenseManager {
    List<Expense> expensesList = new ArrayList<>();

    public void displayAllExpenses(){
        expensesList.forEach(ExpenseManager::disaplyingMethod);
    }

    private static void disaplyingMethod(Expense expense) {
        System.out.println(expense.description());
        System.out.println(expense.type());
        System.out.println(expense.value());
        System.out.println(expense.month());
    }

    public void displayMonthlyExpenses(Scanner scanner){
        System.out.println("Z którego miesiąca chcesz wyświetlić?");
        int month = Integer.parseInt(scanner.nextLine());

        expensesList.stream()
                .filter(expense -> expense.month() == month)
                .forEach(ExpenseManager::disaplyingMethod);

    }
    public void addExpense(Scanner scanner) {
        System.out.println("Jaki wydatek chcesz dodać?");
        String description = scanner.nextLine();
        System.out.println("Jakiego typu jest to wydatek?");
        String type = scanner.nextLine();
        System.out.println("Ile to kosztowało?");
        double value = Double.parseDouble(scanner.nextLine());
        System.out.println("Z którego miesiąca to wydatek?");
        int month = Integer.parseInt(scanner.nextLine());

        Expense expense = new Expense(type, month, value, description);
        expensesList.add(expense);
    }
}
