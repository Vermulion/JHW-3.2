public class BodyMassIndex {
    public double calculate(double weight, double height) {
        double index;
        index = weight / Math.pow(height, 2);

        return index;
    }
}
