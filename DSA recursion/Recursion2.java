class Test3{
    static void fun(int n){
        if(n==0)
        return;
        //System.out.println(n); 
        //fun(3) jab execute honga aur vo n-1 hokar fun(2)
        //honga toh firse starting se execution chalu karega
        fun(n-1);
        System.out.println(n);
        fun(n-1);
    }
}
public class Recursion2{
    public static void main(String[]args){
           Test3.fun(3);
    }
}