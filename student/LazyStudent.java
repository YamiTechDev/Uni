package student;

public class LazyStudent extends Student {
    @Override
    void study(){
        System.out.println("Сегодня не учусь, мне лень. ");
    }
}
