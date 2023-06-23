
import java.util.*;

class Consecutive1s {
    /*NAIVE APPRAOCH 
    public static int Consecutive1(int arr[],int n){
        int res =0;
        for(int i=0;i<n;i++){
            int curr =0;
                for(int j =i;j<n;j++){
                    if(arr[j]==1)
                    curr ++;
                    else break;
                }
            res = Math.max(curr,res);
        }
        return res;
    }*/

    //efficient method
    public static int Consecutive1(int arr[],int n){
        int res = 0;
        int curr = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
            curr = 0;
            else
            curr++;
            res = Math.max(curr, res);
        }
        return res;
    }
    

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the binary array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The consecutive 1s are:");
        System.out.println(Consecutive1(arr, n));
    }
}
