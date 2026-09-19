import java.util.Arrays;

public class MergeAndSortArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 44, 2, 4, 6, 7};//7
        int[] arr2 = new int[]{22, 23, 24, 25, 31, 32, 33, 21, 42, 43, 53, 56};// 12  Sum = 19
        System.out.println(Arrays.toString(mergeAndSortNoArrays(arr1, arr2)));
        System.out.print(Arrays.toString(mergeAndSortArrays(arr1, arr2)));

    }
//-------------------------------------------------------------------------------------------------------------
    public static int[] mergeAndSortNoArrays(int[] first, int[] second) {
        int[] newArr = new int[first.length + second.length]; // Создаю массив с длинной равной общей длинне принимаемых массивов

        for (int i = 0; i < first.length; i++) {// перебираю новый массив и записываю в него массив first
            newArr[i] = first[i];
        }

        for (int i1 = 0; i1 < second.length; i1++) {// перебираю обработанный массив и вставляю массив second на место где переменные не проанализированны
            newArr[first.length + i1] = second[i1];// здесь в индекс передается длинна первого массива(который записан в newArray)+ индекс элемента
        }

        for (int j = 0; j < newArr.length-1; j++) {
            int variable = newArr[j];
            if (newArr[j] > newArr[j + 1]) {
                newArr[j] = newArr[j + 1];
                newArr[j + 1] = variable;
            }
        }
        return newArr;
    }
    //---------------------------------------------------------------------------------------------------------
    public static int[] mergeAndSortArrays(int[] first, int[] second) {
        int[] newArr = new int[first.length + second.length];//Создаю новый массив с длинной равной общей длинне 2 полученных массивов
        System.arraycopy(first, 0, newArr, 0, first.length);// копирую 1й массив в только созданный(newArr)
        System.arraycopy(second,0, newArr, first.length,second.length);// копирую 2й массив в обработанный(newArr) начиная с индекса, следующего за длинной уже записанного массива
        Arrays.sort(newArr);//сортирую полученный массив

        return newArr;
    }
}
