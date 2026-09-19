import java.util.Arrays;

public class GetSubArrayBetween {
    public static void main(String[] args) {
        int start = 2;
        int end = 11;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        String exit = Arrays.toString(getSubArrayBetween(numbers,start,end));
        System.out.print(exit);
    }
    public static int[] getSubArrayBetween(int[] numbers, int start, int end){
        int lengthsNewArray = end-start+1;
        int[]newArray = new int[lengthsNewArray];
        int indexNewArray = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] >= start) && (numbers[i] <= end)) {
                newArray[indexNewArray] = numbers[i];
                indexNewArray++;


            }
        }

        return newArray;
    }


    }


