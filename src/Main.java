public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double indexNorm = service.calculate(98, 1.87);
        System.out.println(indexNorm);

        double indexMax = service.calculate(150, 1.5);
        System.out.println(indexMax);


    }
}
