import java.util.Arrays;

public class BrowserHistoryRunner {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {1, 2, 3, 4, 5};
        int k1 = 2;
        System.out.println("Input: " + Arrays.toString(arr1) + ", k=" + k1);
        System.out.println("Output: " + Arrays.toString(sol.getStrongest(arr1, k1)));

        int[] arr2 = {6, -3, 7, 2, 11};
        int k2 = 3;
        System.out.println("Input: " + Arrays.toString(arr2) + ", k=" + k2);
        System.out.println("Output: " + Arrays.toString(sol.getStrongest(arr2, k2)));
    }
}
