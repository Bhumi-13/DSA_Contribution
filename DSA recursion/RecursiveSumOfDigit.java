import java.util.Scanner;
public class RecursiveSumOfDigit {
    //i/p = 253   o/p = 10
public static int  SumOfDigit(int n){
if(n==0)
return 0;
else
return (SumOfDigit(n/10) + n%10);
}
//n/10 --> removes last digit
//n%10 --> gives last digit
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a:");
    int a = sc.nextInt();
    System.out.println(SumOfDigit(a));

}
}
//time complexity is theta(d)  d=digits in the int.