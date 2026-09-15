import java.util.Scanner;

public class GetAgeDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи возраст 1го человека ");
        byte age1 = scanner.nextByte();
        System.out.print("Введи возраст 2го человека ");
        byte age2 = scanner.nextByte();
        byte result = getAgeDiff(age1, age2);
        System.out.print("Разница в возрасте составляет " + result);
    }

    public static byte getAgeDiff(byte age1, byte age2) {
        return (byte) Math.abs(age1 - age2);
    }
}
