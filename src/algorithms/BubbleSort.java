package algorithms;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        int[] bubble = generateRandomArray(10);
        //print array before sorting
        Arrays.stream(bubble).forEach(x -> System.out.print(x + " "));
        //bubble sort algorithm
        for (int i = 0; i < bubble.length; i++) {
            for (int j = 0; j < bubble.length - i-1; j++) {
                if (bubble[j] > bubble[j+1]){
                    int temp = bubble[j+1];
                    bubble[j+1] = bubble[j];
                    bubble[j] = temp;
                }
            }
        }
        //print after sorting
        System.out.println("\n-------------- after sorting --------------------");
        Arrays.stream(bubble).forEach(x -> System.out.print(x + " "));
    }
    public static int[] generateRandomArray(int size){
        int[] a = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++)
            a[i] = random.nextInt(100);
        return a;
    }
}