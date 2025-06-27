package Book.Arrays;

import java.util.Arrays;

import static ArrayUtility.Swap.swap;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;
        int flag = 0;
        for (int k = 1; k < n; k++) {
            flag = 0;
            for (int i = 0; i < n-k; i++) {
                if (array[i] > array[i+1]) {
                    swap(array, i, i+1);
                    flag = 1;
                }
            }
            if (flag == 0) break;
        }
    }
}
