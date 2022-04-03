package array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        printArray(a);

        reverseArray(a);


    }

    private static void printArray(int[] a) {
        System.out.println("----------------");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        System.out.println("----------------");
    }

    private static void reverseArray(int[] a) { // complexity O(n)

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + ", ");
        }

    }
}
