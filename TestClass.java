/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workapplication;

import java.util.*;

class TestClass {

    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);

        int T = s.nextInt();

        for (int t = 0; t < T; t++) {
            s.nextLine();
            String str = s.nextLine();
            String[] arr = str.split(" ");
            int k = Integer.parseInt(arr[1]);
            //System.out.println(" "+str+" "+k);
            String x = fun(str, k);
            int n = x.length();
            long ans = answer(x);
            System.out.println(ans);
        }
    }

    static long answer(String str) {
        long total = 0;
        int[] residue = {0, 0, 0};
        int[] previous_residue = {0, 0, 0};
        for (int i = 0; i < str.length(); i++) {
            int r = (str.charAt(i) - '0') % 3;
            for (int j = 0; j < 3; j++) {
                residue[j] = previous_residue[(3-r+j)%3 ];
            residue[r] = residue[r] + 1;
            
            total += residue[0];
            for (j = 0; j < 3; j++) {
                previous_residue[j] = residue[j];
            }
        }
    }
        return total;
    }
    static String fun(String S, int K) {
        if (K == 0) {
            return S;
        }
        //System.out.println("Success!!");
        String R = S + rev(S);
        return fun(R, K - 1);
    }

    static String rev(String str) {
        char[] arr = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            char c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++;
            j--;
        }
        return arr.toString();
    }
}
