package chapter03.content02;

public class DuplicatedCode {

    // DRY
    // parasal işlemlerde bigdecimal kullan!
    private double calculateInterest(double money) {
        double result = 15 * money;
        /*
         * more algorithm here..
         */

        return result;
    }

    public static void main(String[] args) {
        LoanUtil.calculateInterest(15, 152432);
    }
}
