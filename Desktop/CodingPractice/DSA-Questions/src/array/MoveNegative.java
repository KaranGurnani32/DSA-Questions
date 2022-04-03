package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveNegative {

    public static void main(String[] args) { // complexity O(n)
        int[] a = {1, 2, -3, 4, -5, -7, -8, 9, 7};

        System.out.println(Arrays.toString(a));

        a = negativeMove(a);
        System.out.println(Arrays.toString(a));
    }

    private static int[] negativeMove(int[] a) {

        int[] b = new int[a.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                b[index++] = a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                b[index++] = a[i];
            }
        }

        return b;
    }
}
