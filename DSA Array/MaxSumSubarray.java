import java.util.*;
class MaxSumSubarray {
    /*NAIVE METHOD 
    public static int MaxSum(int arr[],int n){
        int res = arr[0];
        for(int i=0;i<n;i++){
            int  curr =0;
            for(int j = i;j<n;j++){
                curr = curr + arr[j];
                res = Math.max(curr, res);
            }
        } 
        return res;
    }*/

    //EFFICIENT APPRAOCH
    public static int MaxSum(int arr[],int n){
        int res = arr[0];
        int MaxEnding = arr[0];
        for(int i=1;i<n;i++){
            MaxEnding = Math.max(MaxEnding + arr[i], arr[i]);
            res = Math.max(MaxEnding, res);
                }
                return res;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
        System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Maximum sum of subarray is:");
        System.out.println(MaxSum(arr, n));
    }
}