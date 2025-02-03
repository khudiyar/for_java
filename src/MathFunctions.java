public class MathFunctions {
    public static double pi = 3.14159265358979323846;
    public static double e = 2.7182818284590452354;

    public static double areaCircle(double radius) {
        return pi * radius * radius;
    }

    public static double powerExp(double x) {
        double powExp = 1;
        for (int i = 0; i < x; i++) {
            powExp *= e;
        }
        return powExp;
    }

    public static double areaTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
