import java.util.*;
class CountInversion {
    //NAIVE METHOD
    /*public static int InversionCount(int arr[] , int n){
        int count = 0;
        for(int i=0;i<n-1;i++){          //i<j constrait
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j])
                count++;
            }
        }
        return count;
    }*/

    // EFFICIENT RECURSIVE METHOD
    public static int InversionCount(int arr[],int l,int r){
        int count = 0;
        if(l<r){
            int m = (r+l)/2;
            count += InversionCount(arr, l, m);   //for left half
            count += InversionCount(arr, m+1, r);  //for right half
            count += CountandMerge(arr, l,m, r);  //general
        }
        return count;
    }
    
    public static int CountandMerge(int arr[],int l,int m ,int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int left[] = new int[n1];
        int right[] = new int[n2];

        for(int i=0; i<n1;i++){
            left[i] = arr[i+l];
        }
        for(int j=0; j<n2; j++){
            right[j] = arr[m+1+j];
        }

        int count = 0;
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
                count = count + (n1-i);
            }
        }
        while (i<n1) {
            arr[k++] = left[i++];
        }
        while (j<n2) {
            arr[k++] = right[j++];
        }
        return count;
    }

    public static void main(String[]args){
        int arr[] = {2,4,1,3,5};
        int n = arr.length;
        System.out.println(InversionCount(arr,0,n-1));
        
    }
}
