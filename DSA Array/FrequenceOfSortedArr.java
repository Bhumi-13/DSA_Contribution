import java.lang.*;
class FrequenceOfSortedArr {
    public static void PrintFreq(int arr[],int n){
        int freq=1;
        int i=1;
        while(i<n)
        {
        while(i<n && arr[i] == arr[i-1]){
            freq++;
            i++;
        }
        System.out.println(arr[i-1] + " " + freq);
        i++;
        freq = 1;
    }
    if(n==1 || arr[n-1]!= arr[n-2])
    System.out.println(arr[n-1] + " " + 1);
}

    public static void main(String[]args){
        int arr[] = {10,10,10,20,20,25};
        int n = arr.length;
        System.out.println("given array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        PrintFreq(arr, n);
        
    }
}
