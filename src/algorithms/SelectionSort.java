package algorithms;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {

        int[] selection = generateRandomArray(10);
        //print array before sorting
        Arrays.stream(selection).forEach(x -> System.out.print(x + " "));
        //selection sort algorithm
        for (int i = 0; i < selection.length - 1; i++) {
           int index = i;
            for (int j = i + 1; j < selection.length; j++) {
                if (selection[j] < selection[index])
                    index = j;
            }
            int temp = selection[index];
            selection[index] = selection[i];
            selection[i] = temp;
        }
        //print after sorting
        System.out.println("\n-------------- after sorting --------------------");
        Arrays.stream(selection).forEach(x -> System.out.print(x + " "));
    }
    public static int[] generateRandomArray(int size){
        int[] a = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++)
            a[i] = random.nextInt(100);
        return a;
    }

}
