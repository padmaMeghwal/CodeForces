import java.io.IOException;
import java.util.*;

public class Solution1 {

    static int solution(int[] A) {
        int equilibrium = -1;

        // Check arguments
        try {
            if (A == null) {
                IOException e = new IOException("Array cannot be null");
                throw e;
            } else if (A.length == 0) {
                IOException e = new IOException("A cannot have 0 elements");
                throw e;
            }
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }

        long sumLeft = 0;
        long sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        // Traverse the array, looking for the first equilibrium
        for (int i = 0; i < A.length; i++) {
            //var tempRight = sumRight - A[i];
            sum = sum - A[i];
            if (sumLeft == sum && sum == A[i]) {
                // We have found a solution at the i-th element
                equilibrium = i;
                break;
            }
            sumLeft += A[i];
        }
        //}

        // Return the result
        return equilibrium;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,2,6,3,1,2};
        int ans = solution(arr);
        if (ans == -1) {
            try {
                if (ans == -1) {
                    IOException e = new IOException("no point is available");
                    throw e;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            System.out.println(ans);
        }

    }

}
