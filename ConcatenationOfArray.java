// 1929_ConcatenationOfArray.java
public class ConcatenationOfArray {
    // LeetCode-like function
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    // Simple helper to print array
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // main for local testing
    public static void main(String[] args) {
        ConcatenationOfArray solu = new ConcatenationOfArray();
        int[] nums1 = {1, 2, 1};
        int[] res1 = solu.getConcatenation(nums1);
        printArray(res1); // expected [1,2,1,1,2,1]

        int[] nums2 = {1,3,2,1};
        int[] res2 = solu.getConcatenation(nums2);
        printArray(res2); // expected [1,3,2,1,1,3,2,1]
    }
}
