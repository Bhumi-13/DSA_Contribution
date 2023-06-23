import java.util.*;
class Insertionsort {
   public static void insertsort(int arr[],int n){
        for(int i=1;i<n;i++){
           int key = arr[i];
           int j = i-1; 
           while (j>=0 && arr[j]>key) {
            arr[j+1] = arr[j];
            j--;
           }
           arr[j+1] = key;
        }
   }    

    public static void main(String[]args){
        int arr[] = {20,5,40,60,10,30};
        int n = arr.length;
        insertsort(arr, n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
