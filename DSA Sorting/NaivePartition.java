import java.util.*;
class NaivePartition {
    public static void Partition(int arr[],int n,int p,int l,int h){
        int temp[] = new int[h-l+1];
        int  indx =  0;
        
        for(int i=l;i<=h;i++){
            if(arr[i]<=arr[p] && i!=p){
                temp[indx] = arr[i];
                indx++;
            }
        }
        temp[indx++] = arr[p];
        for(int i=l;i<=h;i++){
            if(arr[i]>arr[p]){
                temp[indx] = arr[i];
                indx++;
            }
        }
        for(int i=l;i<=h;i++){
            arr[i] = temp[i-l];
        }
    }

    public static void main(String[] args){
        int arr[] = {5,13,6,9,12,11,8};
        int n = arr.length;
        Partition(arr, n,n-1 , 0, n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
