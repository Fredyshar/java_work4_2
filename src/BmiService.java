public class BmiService {
    public double calculate(double h, double m) {
        double result = m / (h * h / 10000);
        return result;
    }
}
