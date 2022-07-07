import java.util.Arrays;

public class insertionsort {

    public static void main(String args[]) {
        int[] arr = {10, 20, 30, 25, 40};

        System.out.println(Arrays.toString(arr));

        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[i] < arr[j]) {
                arr[j+1] = arr[j];
                j = j-1;

                arr[j+1] = key;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}