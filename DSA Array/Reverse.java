import  java.lang.*;
 class Reverse {
    public static void reverse(int arr[],int n){
        int low = 0;
        int high = n-1;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

    }
public static void main(String[]args){
      int arr[] = {84,21,36,45,84,77,99};
      int n  = arr.length;
      System.out.println("Original Array:");
      for(int i=0;i<n;i++){
        System.out.print(arr[i] + " ");
      }
      System.out.println();
      reverse(arr, n);
      System.out.println("reverse array:");
      for(int i=0;i<n;i++){
        System.out.print(arr[i] + " ");
      }
}  
}
