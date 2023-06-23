import java.util.*;

class MaxEvenOddSubarray {
    //NAIVE METHOD
    /*public static int MaxEO(int arr[],int n){
        int result =1;
        for(int i=0;i<n;i++){
            int curr= 1;
            for(int j=i+1;j<n;j++){
                if((arr[j]%2==0 && arr[j-1]%2!=0) ||
                (arr[j]%2!=0 && arr[j-1]%2==0))
                curr++;
                else break;
            } 
            result= Math.max(curr, result);
              }
              return result;
    }*/

    //EFFICIENT METHOD
    public static int MaxEO(int arr[],int n){
        int result = 0;
        int curr = 1;
        for(int i=1;i<n;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) ||
            (arr[i]%2!=0 && arr[i-1]%2!=0)){
            curr ++;
           result = Math.max(curr, result);
        }
        else curr = 1;
    }
      
        return result;

    }

    

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array:");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("the longest even odd subarray is:");
        System.out.println(MaxEO(arr, n));
    }
}
