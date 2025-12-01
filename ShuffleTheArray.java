class ShuffleTheArray {
    public int[] ShuffleTheArray(int[] nums, int n) {
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];        // place xi
            ans[2 * i + 1] = nums[i + n]; // place yi
        }

        return ans;
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        ShuffleTheArray s = new ShuffleTheArray();

        int[] nums1 = {2, 5, 1, 3, 4, 7};
        int[] res1 = s.ShuffleTheArray(nums1, 3);
        printArray(res1); // expected [2, 3, 5, 4, 1, 7]

        int[] nums2 = {1, 2, 3, 4, 4, 3, 2, 1};
        int[] res2 = s.ShuffleTheArray(nums2, 4);
        printArray(res2); // expected [1, 4, 2, 3, 3, 2, 4, 1]
    }
}