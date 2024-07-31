public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        // Base case: when years is 0, the future value is the initial value
        if (years == 0) {
            return initialValue;
        }

        // Recursive case: calculate the value for the current year and proceed to the next year
        return calculateFutureValue(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialValue = 1000.0; // Initial value in currency
        double growthRate = 0.05; // Annual growth rate (5%)
        int years = 10; // Number of years into the future

        double futureValue = calculateFutureValue(initialValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: " + futureValue);
    }
}
