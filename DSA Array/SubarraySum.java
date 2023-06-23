import java.util.*;
import java.lang.*;
class  SubarraySum{
    //NAIVE METHOD
   /*  public static boolean getSum(int arr[],int n,int sum){
       for(int i=0;i<n;i++){
            int curr =0;
            for(int j=i;j<n;j++){
                curr += arr[j];
            
            if(curr == sum)
            return true;
            }
        }
        return false;
    }*/

    //EFFICIENT METHOD
    public static boolean getSum(int arr[],int n,int sum){
        int start = 0;
        int curr= 0;
      
        for(int end=0;end<n;end++){
            curr +=  arr[end];
            while (sum < curr){
            curr -=arr[start];
            start++;
        }
         if(curr == sum) 
            return true;
        }
        return false;
    }



    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element in the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the values of sum:");
        int sum = sc.nextInt();
        System.out.println(getSum(arr, n, sum));
    }
}