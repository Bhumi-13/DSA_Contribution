import java.lang.*;


 class SecondLargesteffi {
 public static int secondLargest1(int arr[],int n){
    int largest = 0;
    int res = -1;
    for(int i=0;i<n;i++){
        if(arr[i]>arr[largest]){
            res = largest;
            largest =  i;
        }
        else if(arr[i]!=arr[largest]){
            if(res==-1 || arr[i]>arr[res])
            res = i;
        }
    }
    return res;
 }

public static void main(String[]args){
 int  arr[] = {78,54,64,99,23,14,99};
 int n = arr.length;
 System.out.println("Given array is:");
 for(int i=0;i<n;i++){
    System.out.print(arr[i] + " ");
 }
 System.out.println();
 System.out.println("The second largest number is " + secondLargest1(arr, n));
}    
}
