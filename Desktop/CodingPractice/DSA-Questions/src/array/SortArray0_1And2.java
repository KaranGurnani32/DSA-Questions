package array;

import java.util.Arrays;

public class SortArray0_1And2 {

    public static void main(String[] args) { // complexity O(n)
        int[] a = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        System.out.println(Arrays.toString(a));

        int size = a.length;
        System.out.println(Arrays.toString(sort012(a, size)));
    }

    private static int[] sort012(int[] a, int size) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count0++;
            } else if (a[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        for (int i = 0; i < count0; i++) {
            a[index++] = 0;
        }

        for (int i = 0; i < count1; i++) {
            a[index++] = 1;
        }
        for (int i = 0; i < count2; i++) {
            a[index++] = 2;
        }
        return a;
    }
}
