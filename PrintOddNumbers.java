public class PrintOddNumbers {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,0,10,11,12,13,14,15,16,17,18,19,20,222,234,213,645,32,54,786,66,65};
        printOddNumbers(arr);
    }

    public static void printOddNumbers(int[] arr){
        for (int i : arr) {
            if (i%2==1){
                System.out.print(i+ ", ");
            }
        }
    }
}
