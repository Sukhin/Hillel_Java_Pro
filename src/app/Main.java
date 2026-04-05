package app;

public class Main {

    private static final double CONV_K = 2.20462;

    public static void main(String[] args) {

        System.out.println("Converter App.");


        double kgsInitial = 5;
        double poundsInitial = 12;
        double pounds = convKgsToPounds(kgsInitial);
        double kgs = convPoundsToKgs(poundsInitial);
        System.out.println("Result is " + pounds + " pounds and " + kgs + " kgs.");
    }

    private static double convKgsToPounds(double kgsInitial) {
        return kgsInitial * CONV_K;
    }

    private static double convPoundsToKgs(double poundsInitial) {
        return poundsInitial / CONV_K;
    }
}