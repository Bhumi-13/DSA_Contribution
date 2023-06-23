import java.lang.*;
import java.util.*;
class SecondLargest {
    public static int secondLargest(int arr[],int n){
        int largest = getLargest(arr,n);
        int res =-1;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[largest])
            {
            if(res==-1)
            res = i;
            else if(arr[i]>arr[res])
            res=i;
            }
        }
        return res;

    }

    public static int getLargest(int arr[],int n){
        int largest = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[largest])
            largest = i;
        }
        return largest;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {78,65,88,99,12,99};
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("the largest number is on index " + getLargest(arr,n));
        System.out.println("the second largest number is on index " + secondLargest(arr, n));

    }
}
