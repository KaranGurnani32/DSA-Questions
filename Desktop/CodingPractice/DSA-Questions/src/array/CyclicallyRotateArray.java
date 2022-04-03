package array;

import java.util.Arrays;

public class CyclicallyRotateArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(a));
        rotate(a);
        System.out.println(Arrays.toString(a));
    }

    private static int[] rotate(int[] a) {

        int lastIndex = a.length - 1;
        int x = a[lastIndex];

        for (int i = lastIndex; i > 0; i--) {
            a[i] = a[i-1];
        }

        a[0] = x;
        return a;
    }
}
