import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BmiService service = new BmiService();

        System.out.println("Введите свой вес в кг: ");
        double weight = scan.nextDouble();
        System.out.println("Введите свой рост в метрах через запятую: ");
        double height = scan.nextDouble();
        double myResuil = service.calculate(weight, height);

        System.out.println("Ваш индекс массы тела - " + myResuil);
        if (myResuil < 18.5) {
            System.out.println("У вас дефицит веса.");
        } else if (myResuil > 18.5 && myResuil < 25) {
            System.out.println("Ваш индекс массы тела в норме.");
        } else if (myResuil > 25 && myResuil < 30) {
            System.out.println("У вас избыточная масса тела.");
        } else if (myResuil > 30) {
            System.out.println("У вас ожирение. Садитесь на диету!");
        } else {
            System.out.println("Ошибка");
        }
    }
}
