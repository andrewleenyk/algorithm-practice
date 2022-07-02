import java.util.Arrays;

public class bubblesort {

    public static void main(String args[]) {
        int[] arr = {10, 20, 30, 25, 40};
        boolean sorted = true;
        System.out.println(Arrays.toString(arr));
        while (sorted) {
            sorted = false;
            for (int i = 0; i < arr.length - 1; i++) {
                int num = 0;
                if (arr[i] > arr[i+1]) {
                    num = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = num;
                    sorted = true;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}