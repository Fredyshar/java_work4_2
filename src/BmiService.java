public class BmiService {
    public double calculate(double height, double bodyMass) {
        double result = bodyMass / (height * height / 10000);
        return result;
    }
}
