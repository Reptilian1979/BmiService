public class BmiService {
    public double calculate(double weight, double height) {
        double value = weight / (height * height);
        int bmi = (int) Math.round(value);
        return bmi;
    }
}
