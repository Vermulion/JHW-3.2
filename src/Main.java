public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        double weight = 77.3; //введите вес в киллограммах
        double height = 1.77; //введите рост в метрах
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
