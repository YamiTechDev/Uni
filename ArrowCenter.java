import java.util.Arrays;

public class ArrowCenter {
    public static void main(String[] args) {
        int[] arrOne = {1, 2, 3, 4, 5, 6, 7, 8};// массив четный
        int[] arrTwo = {2, 3, 5, 6, 8, 9, 0, 3, 1};// массив нечетный
        String result1 = Arrays.toString(noArraysCentre(arrOne));
        System.out.println(result1);
        String result2 = Arrays.toString(noArraysCentre(arrTwo));
        System.out.println(result2);
        String result3 = Arrays.toString(arrayCentre(arrOne));
        System.out.println(result3);
        String result4 = Arrays.toString(arrayCentre(arrTwo));
        System.out.print(result4);
    }

    public static int[] noArraysCentre(int[] name) {
        if (name.length % 2 == 0) {
            int[] arrs = new int[]{name[(name.length / 2 - 1)], name[(name.length / 2)]};
            return arrs;
        } else {
            int[] arrs = new int[]{name[name.length / 2]};
            return arrs;
        }
    }
public static int[] arrayCentre(int[] name){
if (name.length%2==0){
    int[] arrs = Arrays.copyOfRange(name,(name.length/2-1),(name.length/2+1));
    return arrs;
}
else {
    int[] arrs = Arrays.copyOfRange(name,(name.length/2),(name.length/2+1));
    return arrs;
}


}
}
