public class BmiService {
    public double calculate(double w, double h) {
        double result = w/(h * h);
        return result;
    }
}
