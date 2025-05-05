public class InvestmentGrowth {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 0.05;

        System.out.println("Year\tAmount on deposit");
        for (int year = 1; year <= 10; year++) {
            principal += principal * rate;
            System.out.printf("%d\t%.2f%n", year, principal);
        }
    }
}