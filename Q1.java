import java.util.*;
public class Q1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        double min_t = Double.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int x = in.nextInt();
            int y = in.nextInt();
            int v = in.nextInt();
             min_t = min(min_t,Math.sqrt((a-x)*(a-x)+(b-y)*(b-y))/v);
        }  
        System.out.println( min_t);
    }
    static double min(double a,double b)
    {
        return a<b?a:b;
    }
}

