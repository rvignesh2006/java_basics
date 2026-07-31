import java.util.*;
public class Sort {
        public static void main(String[] args) {
        int[] arr = {3, 6, 2, 5, 4, 1};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(max);

        System.out.println(result);
    }
}