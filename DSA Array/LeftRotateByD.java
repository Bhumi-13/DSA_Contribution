import java.lang.*;
import java.util.*;
class LeftRotateByD {
    //{Naive appraoch}
    /*public static void leftRotate1(int arr[],int n){
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];}
            arr[n-1]=temp;
        
    }
    public static void leftRotateByd(int arr[],int d,int n){
        for(int i=0;i<d;i++){
            leftRotate1(arr, n);
        }
        }*/


        public static void leftRotateByd(int arr[],int n,int d){
            int temp[] = new int[d];
            for(int i=0;i<d;i++){
                temp[i] = arr[i];
            }
            for(int i=d;i<n;i++){
                arr[i-d]=arr[i];
            }
            for(int i=0;i<d;i++){
                arr[n-d+i]= temp[i];
            }

        }


    

    public static void main(String[]args){
      int arr[] = {45,78,96,2,1,};
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        System.out.println("Enter the index to be rotated:");
        int d = sc.nextInt();
        System.out.println("Given array:");
        for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
        }
        System.out.println();
        leftRotateByd(arr,n,d);
        System.out.println("After rotation:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
