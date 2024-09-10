package CommisionCalculator.util;

public class Printer {
    public static void showMainMenu() {
        System.out.println("*-------How much did you sell today?-------*");
        System.out.println("*******************************");
    }

    public static void showCommission(int comm) {
        System.out.println("*------Commission:------*");
        System.out.println(comm + "%");
    }
}
