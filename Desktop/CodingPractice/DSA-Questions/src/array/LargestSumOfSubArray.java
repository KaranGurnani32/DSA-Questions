package array;

public class LargestSumOfSubArray {

    public static void main(String[] args) { // O(n)

        int[] a = {1, 3, -14, 5, 7, 0, -2, 10, -19};

        int currentSum = 0;
        int maxSum = 0;
        
        int start = 0;
        int end = 0;

        for (int i = 0; i < a.length; i++) {
            if (currentSum + a[i] >= 0) {
                currentSum = currentSum + a[i];
            } else {
                currentSum = 0;
                start = i + 1;
            }
            if (currentSum >= maxSum) {
                maxSum = currentSum;
                end = i;
            }
        }
        System.out.println("max sum = " + maxSum);
        printArray(a, start, end);
    }

    private static void printArray(int[] a, int start, int end) {

        for (int i = start; i <= end; i++) {
            System.out.print(a[i] + ", ");
        }
    }
}
