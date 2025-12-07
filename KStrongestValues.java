import java.util.Arrays;

public class KStrongestValues {
    public static int[] getStrongest(int[] arr, int k) {
        int n = arr.length;
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int m = sorted[(n - 1) / 2];

        int l = 0, r = n - 1;
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            int leftDiff = Math.abs(sorted[l] - m);
            int rightDiff = Math.abs(sorted[r] - m);
            if (rightDiff > leftDiff || (rightDiff == leftDiff && sorted[r] > sorted[l])) {
                res[i] = sorted[r--];
            } else {
                res[i] = sorted[l++];
            }
        }
        return res;
    }

    private static void printArray(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int k1 = 2;
        System.out.print("Input: "); printArray(arr1);
        System.out.print("k = " + k1 + " -> Output: ");
        printArray(getStrongest(arr1, k1)); // expected [5,1]

        int[] arr2 = {6, -3, 7, 2, 11};
        int k2 = 3;
        System.out.print("Input: "); printArray(arr2);
        System.out.print("k = " + k2 + " -> Output: ");
        printArray(getStrongest(arr2, k2));
    }
}
