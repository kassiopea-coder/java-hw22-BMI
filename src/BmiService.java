public class BmiService {
    public double calculate(double weight, double height) {

        double index = weight / Math.pow(height, 2);
        int bmiIndex = (int) Math.round(index);
        return bmiIndex;

    }
}

