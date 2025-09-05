public class NumberOfOneBits {
    // Returns the number of '1' bits (Hamming weight) in the given integer
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1); // Add 1 if the last bit is set
            n >>>= 1;         // Unsigned right shift by 1
        }
        return count;
    }

    // For testing
    public static void main(String[] args) {
        NumberOfOneBits solution = new NumberOfOneBits();
        int n = 11; // Binary: 1011
        System.out.println(solution.hammingWeight(n)); // Output: 3

        int n2 = 128; // Binary: 10000000
        System.out.println(solution.hammingWeight(n2)); // Output: 1
    }
}