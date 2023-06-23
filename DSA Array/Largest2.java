import java.lang.*;
import java.util.*;
 class Largest2 {
public static int largest2(int arr[],int n){
    
    int res=0;
    for(int i=0;i<n;i++){
        if(arr[i]>arr[res])
        res=i;
    }
    return res;
    }


public static void main(String[]args){
int arr[] = {84,75,99,68,12};
int n = arr.length;
System.out.println("Given array is");
for(int i=0;i<n;i++){
    System.out.print(arr[i]+ " ");
}
System.out.println();
System.out.println("largest element is in index"+ largest2(arr, n));
}    
}
