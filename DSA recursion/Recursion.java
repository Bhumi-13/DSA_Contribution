class  Test{
    static void fun1(){
        System.out.println("GFG");
        fun1();
    }

}
public class Recursion {
    public static void main(String[] args){
     Test.fun1();
    }
}
//The o/p will be stackoverflow.....
//CONTINUE GFG GFG GFG ......
    
