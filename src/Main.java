public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double h = 178;
        double m = 67.5;
        double index = service.calculate(h,m);
        System.out.println("Ваш индекс тела: " + index);
    }
}
