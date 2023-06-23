import java.util.*;
class Selectionsort {
    /*public static void selectsort(int arr[],int n){
        int temp[] = new int[n];
        for(int i=0;i<n;i++){
            int min_ind = 0;
            for(int j=1;j<n;j++){
                if(arr[j]<arr[min_ind])
                min_ind = j;
                temp[i] =  arr[min_ind];
                arr[min_ind] = infinity;
            }
        }
for(int i=0;i<n;i++){
    arr[i] = temp[i];
}
 }*/

 //optimized solution
 public static void selectsort(int arr[],int n){
    for(int i=0;i<n;i++){
        int min_ind = i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min_ind])
            min_ind = j;
        }
    
            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;
    }
}

    public static void main(String[]args){
        int arr[] = {45,85,7,24,99};
        int n = arr.length;
        selectsort(arr, n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
