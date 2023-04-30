import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your array lenght : ");
        int n = scan.nextInt();
        System.out.print("Enter your max number : ");
        int k = scan.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rnd.nextInt(k);
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println("Your max element number is : " + findMaxElemnt(myArray) + " and stored in index # " + getMaxIndex(myArray));
        System.out.println("Your min element number is : " + findMinElemnt(myArray) + " and stored in index # " + getMinIndex(myArray));
        swapMinMax(myArray);
        System.out.println("AFTER SWAP");
        System.out.println("Your max element number is : " + findMaxElemnt(myArray) + " and stored in index # " + getMaxIndex(myArray));
        System.out.println("Your min element number is : " + findMinElemnt(myArray) + " and stored in index # " + getMinIndex(myArray));
    }

    static int findMinElemnt(int[] array) {
        return Arrays.stream(array).min().getAsInt();
    }
    static int findMaxElemnt(int[] array) {
        return Arrays.stream(array).max().getAsInt();
    }
    public static int getMinIndex(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int getMaxIndex(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static void swap(int[] array, int m, int n) {
        int temp = array[m];
        array[m] = array[n];
        array[n] = temp;
    }
    public static void swapMinMax(int[] array) {
        int minIndex = getMinIndex(array);
        int maxIndex = getMaxIndex(array);
        swap(array, minIndex, maxIndex);
    }
}
