package CommisionCalculator;

import CommisionCalculator.calculator.CommCalculator;
import CommisionCalculator.util.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sales;
        Scanner scanner = new Scanner(System.in);

        Printer.showMainMenu();                                     //executes showMainMenu function in Printer.java
        sales = scanner.nextInt();

        CommCalculator commission = new CommCalculator(sales);
        int comm = commission.showComm();

        Printer.showCommission(comm);                               //executes showCommission function in Printer.java
    }
}