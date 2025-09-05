public class CountingBits {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            res[i] = res[i >> 1] + (i & 1);
        }
        return res;
    }

    // For testing
    public static void main(String[] args) {
        CountingBits solution = new CountingBits();
        int n = 5;
        int[] result = solution.countBits(n);
        for (int r : result) {
            System.out.print(r + " "); // Output: 0 1 1 2 1 2
        }
    }
}