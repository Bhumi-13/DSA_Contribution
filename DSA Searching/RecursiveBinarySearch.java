
import java.util.*;
class RecursiveBinarySearch {
    public static int RecursiveBinary(int arr[],int low,int high,int x){
        
        if(low>high)
        return -1;

        int mid = (low+high)/2;
        if(arr[mid]==x)
        return mid;
        else if(arr[mid]>x)
        return RecursiveBinary(arr, low, mid-1, x);
        else 
        return RecursiveBinary(arr, mid+1, high, x);
   
    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the element to be searched:");
        int x =  sc.nextInt();
        System.out.println(RecursiveBinary(arr, 0, n-1, x));
    }
}
