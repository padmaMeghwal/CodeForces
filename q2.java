import java.util.*;

public class q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int q = in.nextInt();
        int[] coins = new int[q];
        for (int i = 0; i < q; i++) {
            coins[i] = in.nextInt();
        }
        Arrays.sort(arr);
        
        int prev = 0;
        for (int i = 0; i < q; i++) {
            int count = 0;
            //binary search
            if (coins[i] >= arr[n - 1]) {
                count = n;
            } else if (coins[i] < arr[0]) {
                count = 0;
            } else if (coins[i] == arr[0]) {
                count = 1;
            } else {
                int tmp = coins[i];
                count = binarySearch(tmp, arr, 0, n - 1);
            }
            System.out.println(count);
        }

    }

    static int binarySearch(int tmp, int[] arr, int low, int high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == tmp || mid + 1 <= high && arr[mid] < tmp && arr[mid + 1] > tmp) {
            return mid + 1;
        }

        if (tmp < arr[mid]) {
            return binarySearch(tmp, arr, low, mid-1);
        }
        return binarySearch(tmp, arr, mid + 1, high);
    }
}
