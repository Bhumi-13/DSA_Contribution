 class Test1{
    static void fun1(int n){
        if(n==0)
        return;
        System.out.println("GFG");
        fun1(n-1);
    }
 }

public class Recursion1 {
    public static void main(String[] args){
        //This is the modified recursive function which 
        //does not provide stackoverflow error it will 
        //get terminate at some time
            Test1.fun1(5);
    }
}
