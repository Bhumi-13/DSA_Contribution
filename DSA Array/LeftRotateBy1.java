import java.lang.*;

class LeftRotateBy1 {
public static void leftRotate(int arr[],int n){
    int temp = arr[0];
    for(int i=1;i<n;i++){
        arr[i-1]=arr[i];
        arr[n-1]=temp;
    }
}
    
    public static void main(String[]args){
        int arr[] = {45,48,79,99};
        int  n = arr.length;
        System.out.println("given array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        leftRotate(arr, n);
        System.out.println("After rotation by 1:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
