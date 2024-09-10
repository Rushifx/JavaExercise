package CommisionCalculator.calculator;

public class CommCalculator {

    int sales;

    public CommCalculator(int sales) {
        this.sales = sales;
    }

    public int showComm() {
        int comm = 0;

        if (this.sales < 1000) {
            System.out.println("N/A");
        } else if (this.sales >= 1000 && this.sales <= 4999) {
            comm = 10;
        } else if (this.sales >= 5000 && this.sales <= 9999) {
            comm = 20;
        } else if (this.sales >= 10000) {
            comm = 30;
        } else {
            System.out.println("Invalid Input");
        }
        return comm;
    }
}