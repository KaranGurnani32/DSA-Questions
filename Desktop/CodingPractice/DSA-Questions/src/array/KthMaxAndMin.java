package array;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthMaxAndMin {
    public static void main(String[] args) { // complexity O(n)

        Integer [] a = {8, 13, 0, 69, 2, 84, 3, 97, 16, 507, 6, 4};

        Integer k = 7;

        Integer answer = kthMax(a, k);

        System.out.println("answer = " + answer);

        answer = kthMin(a, k);

        System.out.println("answer = " + answer);
    }

    private static Integer kthMin(Integer[] a, Integer k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < k; i++) {
            priorityQueue.add(a[i]);
        }

        System.out.println("priorityQueue = " + priorityQueue);

        for (int i = k; i < a.length; i++) {
            System.out.println("priorityQueue = " + priorityQueue);
            if (a[i] < priorityQueue.peek()) {
                priorityQueue.poll();
                priorityQueue.add(a[i]);
            }
        }
        return priorityQueue.peek();
    }

    private static Integer kthMax(Integer[] a, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            priorityQueue.add(a[i]);
        }

        System.out.println("priorityQueue = " + priorityQueue);

        for (int i = k; i < a.length; i++) {
            System.out.println("priorityQueue = " + priorityQueue);
            if (a[i] > priorityQueue.peek()) {
                priorityQueue.poll();
                priorityQueue.add(a[i]);
            }
        }
        return priorityQueue.peek();
    }
}
