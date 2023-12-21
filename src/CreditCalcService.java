public class CreditCalcService {
    public double calculateMonthPay(double amountOfCredit, float loanRate, int creditTerm) {
        // monthPay -сумма ежемесячного аннуитетного платежа
        // amountOfCredit - сумма кредита
        // loanRate - годовая процентная ставка по кредиту формат "p.pp"
        // creditTerm - количество лет кредита
        double monthPay = amountOfCredit * (((loanRate / 100) / 12 * Math.pow((1 + (loanRate / 100) / 12), (creditTerm * 12)) / (Math.pow((1 + (loanRate / 100) / 12), (creditTerm * 12)) - 1)));
        return monthPay;
    }
}
