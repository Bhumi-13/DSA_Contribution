class Test2{
    static void fun(int n){
         if(n==0)
        return;
        //System.out.println(n);
        fun(n-1);
        System.out.println(n);

    }
}


public class Recursion3 {
    public static void main(String[]args){
            //print 1 to n 
            Test2.fun(5);
    }
}
