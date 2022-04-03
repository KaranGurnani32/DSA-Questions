package array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeHeights {
    // First we take array and sort it
    // then
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = inputArray();

        int n = arr.length;


        System.out.println(Arrays.toString(arr));

        System.out.println("Enter K : ");
        int k = scanner.nextInt();

        System.out.println(getMinDiff(arr, n, k));
    }

    private static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Data : ");
        String input = scanner.nextLine();

        String[] aString = input.split(" ");
        int[] a = new int[aString.length];
        for (int i = 0; i < aString.length; i++) {
            a[i] = Integer.parseInt(aString[i]);
        }

        return a;
    }

//    private static int getMinDiff(int[] arr, int n, int k) {
//
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if (i == 0) {
//                arr[i] = arr[i] + k;
//                i = i + 2;
//            }
//
//            if (i == 1) {
//                arr[i] = arr[i] - k;
//                i = i + 2;
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//        int max = 0;
//        for (int i = 1; i < arr.length; i++) {
//
//            int difference = arr[i - 1] - arr[i];
//            if (difference > max) {
//                max = difference;
//            }
//        }
//
//        return max;
//    }
    private static int getMinDiff(int[] arr, int n, int k) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int ans = arr[n-1] - arr[0];

        int smallest = arr[0] + k;
        int largest = arr[n-1] - k;

        int max = largest - smallest;

        System.out.println(Arrays.toString(arr));


        return max;
    }
}
