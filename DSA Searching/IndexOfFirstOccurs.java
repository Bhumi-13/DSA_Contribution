import java.util.*;
class IndexOfFirstOccurs {
    //EFFICIENT APPRACH WITH RECURSION
    /*public static int FirstOccur(int arr[],int n,int low,int high, int x){
        if(low>high)
        return -1;
        int mid = (low+high)/2;
         if(arr[mid]>x)
        return FirstOccur(arr, n, mid+1, high, x);
        else if(arr[mid]<x)
        return FirstOccur(arr, n, low, mid-1, x);
        else{
            if(mid==0 || arr[mid-1] != arr[mid])
            return mid;
            else 
            return FirstOccur(arr, n, low, mid-1, x);
        }
    }*/

    //EFFICIENT APPOARCCH WITH ITERATIVE SOLUTION
    public static int FirstOccur(int arr[],int n,int x){
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]>x){
                high = mid -1;
            }
            else if(arr[mid]< x){
                low =  mid +1;
            }
            else{
                if(mid==0 || arr[mid-1]!=arr[mid])
                return mid;
                else
                high = mid-1;
            }
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
       // System.out.println(FirstOccur(arr, n, 0, n-1, x));
       System.out.println(FirstOccur(arr, n, x));
}
}
