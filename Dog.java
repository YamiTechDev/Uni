public class Dog {
    int ageDog;
    String nameDog;


    public static void sayHello() {
        System.out.println("Гав!!!");
    }

    public static void catchCat(Cat cat){
        System.out.println("КОШКА ПОЙМАНА!!!");
        Cat.sayHello();
        Dog.sayHello();
    }
}
