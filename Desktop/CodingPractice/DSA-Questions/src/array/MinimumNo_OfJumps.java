package array;

public class MinimumNo_OfJumps {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 2, 4, 2, 0, 1, 1};

        int jumps = minJumps(arr);
        System.out.println(jumps);
    }

    public static int minJumps(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) { // doubt if i = 0 + 1 = 1, then in for loop will it be ++?
            if (arr[i] == 0) {
                return -1;
            } else { // to calculate min no. of jumps
                i = i + arr[i]; // i = 0, 2, 3, 4, 6, 8, 9
                count++;
            }

            if (i >= n - 1) {
                return count;
            }
        }
        return -2;
    }
}
