import java.io.*;
public class RecursiveSumSubset1 {
       public static int  CountSubSet(int[]arr,int sum,int n){
        if(n==0)
        return (sum==0)? 1:0;  //agar sum=0 return 1 otherwise 0
        return CountSubSet(arr, sum, n-1) + 
              CountSubSet(arr, sum-arr[n-1], n-1);
        
        
              /*if(sum==0)
        return 1;
        if(sum <0)
        return 0;
        if(i==arr.length);
        return 0;
       //return CountSubSet(arr, sum-arr[i], i+1) + 
             // CountSubSet(arr, sum, i+1);*/
       }
    public static void main(String[]args){
    int []arr = {20,10,5,15};
    System.out.println(CountSubSet(arr, 25, 4));
    }
}


//20,15,5,10 inko add krke 25 konse konse way me aa sakte yeh batana hai!!!