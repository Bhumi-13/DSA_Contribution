import java.util.Scanner;
class CountOccurence{
    //NAIVE SOLUTION    ---> o(n)
    /*public static int Count(int arr[],int n, int x){
        int res =0;
        for(int i=0;i<n;i++){
            if(arr[i]==x)
            res++;
        }
        return res;
    }*/

    //first occur and lastt occur dono ko call karo aur bich k gin lo

    public static int FirstOccur(int arr[],int n,int x){
        int low =0;
        int high =n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x)
            high = mid-1;
            else if(arr[mid]<x)
            low = mid+1;
            else{
                if(mid==0 || arr[mid-1]!= arr[mid])
                return mid;
                else
               high =mid-1;
            }
        }
        return -1;
    }

    public static int LastOccur(int arr[],int n,int x){
        int low =0;
        int high =n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x)
            high = mid-1;
            else if(arr[mid]<x)
            low = mid+1;
            else{
                if(mid==n-1 || arr[mid+1]!= arr[mid])
                return mid;
                else
               low =mid+1;
            }
        }
        return -1;
    }

    //actual count
    public static  int Count(int arr[],int n,int x){
        int first = FirstOccur(arr,n,x);
        if(first == -1)
        return 0;
        else
        return LastOccur(arr,n,x) - first + 1;
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
        System.out.println("Enter the number whose count to be calculated:");
        int x = sc.nextInt();
        System.out.println(Count(arr,n,x));

    
}
}