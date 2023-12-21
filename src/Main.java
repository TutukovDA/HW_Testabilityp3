public class Main {
    public static void main(String[] args) {
        float loanRate = 9.99F;//Процентная ставка
        double amountOfCredit = 1_000_000;// Сумма кредита
        int creditTerm = 3;// Максимальный срок кредита в годах
        for (int i = 1; i <= creditTerm; i++) {
            CreditCalcService calcService = new CreditCalcService();
            double monthPay = calcService.calculateMonthPay(amountOfCredit, loanRate, i);
            System.out.println("Срок кредита (в годах)    " + "Ежемесячный платеж   " + "Процентная ставка ");
            System.out.println("        " + i + "  " + "                      " + (int) monthPay + " ₽               " + loanRate + "%");
        }
    }
}
