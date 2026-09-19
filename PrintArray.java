public class PrintArray {
    public static void main(String[] args) {
        int[] numbers = {1,3,4,5,2,7,8,9,0,9};
        printArray(numbers);
    }

    public static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i);

        }
    }
}
