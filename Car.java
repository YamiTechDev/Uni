import java.lang.AutoCloseable;

public class Car implements AutoCloseable {
// немного усложнил класс кар добавив параметры и конструкторы
    private String color;
    private double maxSpeed;
    Car(String color, double maxSpeed){
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    Car(String color){
        this.color = color;
        this.maxSpeed = 110;
    }
    Car(double maxSpeed){
        this.maxSpeed = maxSpeed;
        this.color = "Black";
    }
    Car(){
        this.color = "Black";
        this.maxSpeed = 110;
    }

    @Override
    public void close() {
        System.out.println("Машина закрывается...");
    }
    public void drive() {
        System.out.println("Машина поехала.");
    }
    public static void main() {
        try  (Car car = new Car(155)){// Блок трай пытается создать новый обьект класса кар
            System.out.println("This Car color is " + car.color);
            System.out.println("Maximal Speed = " + car.maxSpeed);
            car.drive();
        } catch (RuntimeException e) {

        }
}}
