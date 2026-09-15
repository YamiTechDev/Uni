import java.util.Scanner;

public class CalcCircleRadius {
    public static void main(String[] args) {
        System.out.print("Введите площадь акружности ");
        Scanner scanner = new Scanner(System.in);
        double area = scanner.nextDouble();
        calcCircleRadius(area);
    }

    static void calcCircleRadius(double area) {
        //R = корень из площади деленное на число пи

        double radius = Math.sqrt(area / Math.PI);
        System.out.println("Радиус окружности равен = " + radius);
    }
}

