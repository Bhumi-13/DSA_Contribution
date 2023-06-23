import java.util.*;

class BinarySearch{
    //LINEAR SEARCH ----(DOESNT NECESSARY REQUIRED SORTED AARAY)
    /*
    public static int Binary(int arr[],int n, int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x)
            return i;
        }
        return -1;
    }*/


    //BINARY SEARCH
    public static int Binary(int arr[], int n, int x){
        int low=0;
        int high = n-1;
        while(low<=high){
        int mid = (low + high)/2;
        if(arr[mid]==x)
        return mid;
        else if(arr[mid]>x)
        high = mid -1;
        else 
        low = mid + 1;
        }
        return -1;
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
        System.out.println(Binary(arr,n,x));
    }
}