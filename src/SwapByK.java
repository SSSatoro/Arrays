import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SwapByK {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int[] arrays = new int[k];
        IntStream.rangeClosed(1, k).forEach(i -> arrays[i - 1] = i);
        System.out.println(Arrays.toString(arrays) + " do");
        swapsTheElementsOfAnArray(arrays, 1);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }
    public static void swapsTheElementsOfAnArray(int[] array, int position) {
        if (position > 0) {
            for (int i = 0; i < position; i++) {
                int n = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = n;
            }
        } else {
            for (int i = 0; i > position; i--) {
                int n = array[0];
                for (int j = 1; j < array.length; j++) {
                    array[j - 1] = array[j];
                }

                array[array.length - 1] = n;
            }
        }
    }
}
