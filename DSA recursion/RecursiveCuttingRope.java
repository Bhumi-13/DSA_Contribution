import java.io.*;
import java.util.*;
public class RecursiveCuttingRope {
    public static int MaxPieces(int n,int a,int b,int c){
        if(n==0)
        return 0;
        if(n<0)
        return -1;
        int res= Math.max(MaxPieces(n-a,a,b,c),
                 Math.max(MaxPieces(n-b,a,b,c),
                 MaxPieces(n-c,a,b,c)));         
        if(res==-1)
        return -1;
        return res +1;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of n , a, b & c");
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(MaxPieces(n, a, b, c));
    }
}
