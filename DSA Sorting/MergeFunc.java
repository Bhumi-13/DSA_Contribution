import java.util.*;
class MergeFunc {
    public static void mergefunc(int arr[],int low,int high,int mid){
        //making two arrays
        int n1 = mid-low+1;
        int  n2 = high - mid;
        int left[] = new int[n1];
        int Right[] = new int[n2];
    for(int i=0;i<n1;i++){
        left[i] = arr[low+i];
    }
    for(int i=0;i<n2;i++){
        Right[i] = arr[mid+i+1];
    }

    //implementing merge sort
    int i=0;
    int j=0;
    int k = low;
    while(i<n1 && j<n2){
        if(left[i] <= Right[j]){
           arr[k] = left[i];
           i++;
           k++;
        }
        else{
            arr[k] = Right[j];
            j++;
            k++;
        }
    }
    while (i<n1) {
        arr[k] = left[i];
        i++;
        k++;
    }
    while(j<n2){
        arr[k] = Right[j];
        j++;
        k++;
    }
 }
    public static void main(String[]args){
        int arr[] = {10,15,20,11,30};
        int n = arr.length;
        int low = 0;
        int mid = 2;
        int high =  4;
        mergefunc(arr, low, high, mid);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]  + " ");
        }
    }
}
