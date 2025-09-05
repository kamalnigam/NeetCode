public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR cancels out repeated numbers
        }
        return result;
    }

    // For testing
    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();
        int[] nums = {2, 2, 1};
        System.out.println(solution.singleNumber(nums)); // Output: 1

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println(solution.singleNumber(nums2)); // Output: 4
    }
}