package Book.Arrays;

import java.util.Arrays;

public class InsertDelete {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 6, 7, 0, 0, 0, 0, 0};
        insert(array, 9, 10);
        delete(array, 3);
        System.out.println(Arrays.toString(array));
    }

    static void insert(int[] array, int index, int value) {
        int j = array.length - 2;
        while (j >= index) {
            if (index == array.length - 2) {
                j--;
                continue;
            }
            array[j+1] = array[j];
            j--;
        }
        array[index] = value;
    }

    static void delete(int[] array, int index) {
        for (int j = index; j < array.length - 1; j++) {
            array[j] = array[j+1];
            if (j == array.length - 2) {
                array[j+1] = 0;
            }
        }
    }
}
