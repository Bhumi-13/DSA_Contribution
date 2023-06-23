class Test4{
    static void fun(int n, int k){
        if(n==0)
        return;
        System.out.println(k);
        fun(n-1,k+1);
    }
}
public class TailRecursive {
    public static void  main(String[]args){
        Test4.fun(5, 1);
    }
}
