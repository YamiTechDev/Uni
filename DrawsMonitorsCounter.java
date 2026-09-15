import java.util.Scanner;

public class DrawsMonitorsCounter {

    public static void main(String[] args) {
        int monitors, programmers, result;                                                      // объявляем переменные неоюходимые для работы
        Scanner scan = new Scanner(System.in);                                                  //создание объекта типа сканер и выделение под него места
        System.out.println("введите количество мониторов");                                     //сообщение пользователю
        monitors = scan.nextInt();                                                              //получение пользовательского ввода и присвоение значения переменной
        System.out.println("введите количество программистов");                                 // сообщение пользователю
        programmers = scan.nextInt();                                                           //получение пользовательского ввода и присвоение значения переменной
        result = monitors % programmers;                                                        //вычисление остатков от деления между программистами и присвоение значения переменной
        System.out.print("количество мониторов которые никому не достануться   " + result);     //вывод результата  пользователю
    }
}
