public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        {
            double weight = 90.7;
            double height = 1.55;
            int bmi;
            bmi = (int) service.calculate(weight, height);
            System.out.println("Индекс массы тела = " + bmi + " кг/кв.метр");
        }
    }
}