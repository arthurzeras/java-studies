package entities;

public class CurrencyConverter {
    public static final double IOF = 6.0;

    public static double convertDollar(double dollar, double value) {
        double netConversion = dollar * value;
        return netConversion + netConversion * IOF / 100;
    }
}
