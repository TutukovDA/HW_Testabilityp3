public class CreditCalcService {
    public double calculate(double s, double p, int n) {
        // se -сумма ежемесячного аннуитетного платежа
        // s - сумма кредита
        // р - годовая процентная ставка по кредиту формат "p.pp"
        // n - количество лет кредита
        double se = s*(((p/100)/12*Math.pow((1+(p/100)/12),(n*12))/(Math.pow((1+(p/100)/12),(n*12))-1)));
        return se;
    }

}
