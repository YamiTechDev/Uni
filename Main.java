public class Main {
    public static void main(String[] args) {
        Dog firstDog = new Dog();// создал экземпляр класса дог
        firstDog.ageDog = 5;
        firstDog.nameDog = "Chelsy";

        Cat firstCat = new Cat();// создал экземпляр класса кэт
        firstCat.ageCat = 2;
        firstCat.nameCat = "Mars";
        Cat.sayHello();
        Dog.sayHello();
        Dog.catchCat(firstCat);

        Day toDay = Day.FRIDAY;
        System.out.println(toDay.getRusName());
        System.out.println("Выходной??? " + toDay.isWeekend());
    }
}