package array;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {

    public static void main(String[] args) {

        int [] a = {1, 3, 4, 5, 7};
        int [] b = {2, 4, 6, 7, 8, 10};

        System.out.println(Union(a, b));

        System.out.println(intersection(a, b));


    }

    private static Set<Integer> intersection(int[] a, int[] b) { // O(n + m)
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int element : a) {
            set.add(element);
        }

        for (int element : b) {
            if (set.contains(element)) {
                set2.add(element);
            }
        }

        return set2;
    }

    private static Set<Integer> Union(int[] a, int[] b) { // O(n + m)
        Set<Integer> set = new HashSet<>();

        for (int element : a) {
            set.add(element);
        }

        for (int element : b) {
            set.add(element);
        }

        return set;
    }
}
