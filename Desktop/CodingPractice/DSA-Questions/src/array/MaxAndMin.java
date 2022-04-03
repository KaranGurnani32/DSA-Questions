package array;

public class MaxAndMin {
    public static void main(String[] args) { // complexity O(n)
        int[] a = {8, 2, 8, 5, 3, 1, 0, 3, 6, 0};

        int max = maxOfArray(a);
        int min = minOfArray(a);

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    private static int maxOfArray(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }
    private static int minOfArray(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }
}