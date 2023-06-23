import java.lang.*;

class Duplicate {
public static int duplicate(int arr[],int n){
    int res = 1;    //first element remain in the result
    for(int i=1;i<n;i++){
        if(arr[i]!=arr[res-1])  //compare karo previous se 
        {
            arr[res] = arr[i];
            res++;
        }
    
    }
    return res;
}
    
    public static void main(String[]args){
        int arr[] ={10,20,20,30,30,30};
        int n = arr.length;
        System.out.println("With duplicacy:");
        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int a = duplicate(arr, n);
        System.out.println("Without Duplicacy:");
        for(int i=0;i<a;i++){
            System.out.print(arr[i] + " ");

        }
        
    }

}
