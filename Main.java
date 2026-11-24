import java.util.HashSet;
import java.util.Set;

//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> на полях.
public class Main {
    public static void main(String[] args) {
        Set<Integer> num1 = new HashSet<>();
        Set<Integer> num2 = new HashSet<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);

        num2.add(3);
        num2.add(4);
        num2.add(5);
        num2.add(6);
        num2.add(7);
        Set<Integer> integers = SymmetricDifference.symmetricDifference(num1, num2);
        System.out.println(integers);
    }
}