import java.lang.*;
class Sorted {
    public static boolean sorting(int arr[],int n){
        for(int i=1;i<n;i++){
           // for(int i=0;i<n;i++){
            //for(int j=i+1;j<n;j++){
                //if(arr[i]>arr[j]) ---------NAIVE METHOD USES 2 LOOPS
            if(arr[i]<arr[i-1])
            return false;
        //}
    }
    return true;
    }
    public static void main(String[]args){
        int arr[]= {12,54,84,99};
        int n = arr.length;
        System.out.println("given array is");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("the given array is sorted true or false = " + sorting(arr, n) );
    }
}
