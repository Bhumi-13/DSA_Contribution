import java.util.*;
class QuickSortByLumoto {
    public static void QuickSort(int arr[],int l, int h){
        if(l<h){
            int p = lomato(arr, l, h);

            QuickSort(arr, l, p-1);
            QuickSort(arr, p+1, h);
        }
    }


    public static int lomato(int arr[],int l,int h){
        int pivot = arr[h];
        int i=l-1;
        for(int j=l;j<=h;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp1 = arr[i+1];
                arr[i+1] = arr[h];
                arr[h] = temp1;
                return (i+1);

    }

    public static void main(String[]args){
        int arr[] = {8,4,7,9,3,10,5};
        int n=arr.length;
        QuickSort(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }    
}
