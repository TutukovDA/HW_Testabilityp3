public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            CreditCalcService calcService = new CreditCalcService();
            double se = calcService.calculate(1_000_000, 9.99, i);
            System.out.println("Ежемесячный платеж   " + "Процентная ставка ");
            String p = "9,99";
            System.out.println("   " + (int) se + " ₽               " + p + " %");
        }
    }
}
