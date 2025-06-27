package ArrayUtility;
import java.util.Arrays;
import static ArrayUtility.Swap.swap;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        if (arr == null || arr.length == 0) { //Check arr == null before arr.length, as otherwise it can cause NullPointerException if arr is null.
            System.out.print("Invalid or empty array.");
            return;
        }

        int end = arr.length - 1;
        int start = 0;

        while(start <= end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
