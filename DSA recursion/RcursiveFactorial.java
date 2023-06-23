class Factorial{
        static int fac(int n){
            if (n == 0)
            return 1;
            else
             return (n* fac(n-1));
        }
}
public class RcursiveFactorial {
    public static void main(String[]args){
        System.out.println(Factorial.fac(4));
        
    }
}
