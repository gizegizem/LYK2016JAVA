package tr.org.linux.kamp2016.helloworld;

public class Interest {
    public static void main(StringExample[] args) {

        double amount;
        double principal = 1000.0; // faizden öncesi bakiye
        double rate = 0.05; // faiz oranı

        System.out.printf("%s %20s %n", "Yıl:", "Faizli para:");

        for (int year = 1; year <= 10; ++year) {

            amount = principal * Math.pow(1.0 + rate, year);

            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
}
