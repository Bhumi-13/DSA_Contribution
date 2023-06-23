import  java.util.*;
 class Bubblesort {
    //bubblesort normal
     /*static void bubblesort(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
 }
}*/
   

//bubble sort optimized version
public static void bubblesort(int arr[],int n){
 for(int i=0;i<n;i++){
    boolean swapped = false;
    for(int j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp; 
            swapped = true;
        }
     }
     if(swapped == false)
     break;
    }
}

public static void main(String[]args){
    int arr[] = {45,78,55,99,105,2};
    int n = arr.length;
    bubblesort(arr, n);
    for(int i=0;i<n;i++){
        System.out.println(arr[i] + " ");
    }
}
}
