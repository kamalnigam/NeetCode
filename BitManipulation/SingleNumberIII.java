public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        // Find a set bit (differs between the two single numbers)
        int diff = xor & (-xor);
        int[] res = new int[2];
        for (int num : nums) {
            if ((num & diff) == 0) {
                res[0] ^= num;
            } else {
                res[1] ^= num;
            }
        }
        return res;
    }

    // For testing
    public static void main(String[] args) {
        SingleNumberIII solution = new SingleNumberIII();
        int[] nums = {1, 2, 1, 3, 2, 5};
        int[] result = solution.singleNumber(nums);
        System.out.println(result[0] + " " + result[1]); // Output: 3 5 (order may vary)
    }
}