import java.lang.*;
import java.util.*;
class Largest {
    public static int largest(int arr[],int n){
       
        for(int i=0;i<n;i++){
            boolean flag = true;
            for(int j=i;j<n;++j){
                if(arr[j]>arr[i]){
                    flag = false;
                    break;
                }
            }
               if( flag == true)
                return i;
            
        }
    
    return -1;
}

    public static void main(String[]args){
        int arr[] = {45,89,78,99,30};
        int n = arr.length;
        System.out.println("Given array is");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The largest ekement index:"+ largest(arr,n));

    }
}
