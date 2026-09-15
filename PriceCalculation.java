import java.util.Scanner;

public class PriceCalculation {
    public static void main(String[] args) {
        double price, calculationPrice;
        int count; //Объявление переменных
        Scanner scan = new Scanner(System.in);
        System.out.println("введите стоимость 1 товара");
        price = scan.nextDouble();
        System.out.println("введите количество товаров");
        count = scan.nextInt();
        calculationPrice = count * price;
        System.out.print("Итоговая стоимость товаров составляет  " + calculationPrice);
    }
}
