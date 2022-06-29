public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 178;
        double bodyMass = 67.5;
        double index = service.calculate(height, bodyMass);
        System.out.println("Ваш индекс тела: " + index);
    }
}
