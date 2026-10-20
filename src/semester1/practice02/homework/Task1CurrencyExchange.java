package semester1.practice02.homework;

public class Task1CurrencyExchange {
    public static void main(String[] args) {
        double usdAmount = 250.0;
        final double EXCHANGE_RATE = 41.25;
        final double COMMISSION_PERCENT = 1.5;

        double uahAmount = usdAmount * EXCHANGE_RATE;
        double commission = Math.floor((uahAmount * (COMMISSION_PERCENT / 100)) * 100) / 100;
        double clearSum = Math.floor((uahAmount - commission) * 100) / 100;

        System.out.println("================ КВИТАНЦІЯ ОБМІНУ ================" +
                "\nСума до обміну:             " + usdAmount + " USD" +
                "\nКурс валют:                 " + EXCHANGE_RATE + " UAH/USD" +
                "\nНараховано до комісії:      " + uahAmount + " UAH" +
                "\nКомісія банку (" + COMMISSION_PERCENT + "%):       " + commission + " UAH" +
                "\n--------------------------------------------------" +
                "\nЧиста сума до видачі:       " + clearSum + " UAH" +
                "\nДо видачі готівкою:         " + Math.round(clearSum) + " UAH" +
                "\n==================================================");
    }
}
