import java.util.*;
class QuickSortHoare {
    public static void QuickSort(int arr[],int l,int h){
        if(l<h){
            int p = Hoare(arr,l,h);
            QuickSort(arr, l, p);
            QuickSort(arr, p+1, h);
        }
    }
        public static int Hoare(int arr[],int l,int h){
            int pivot = arr[l];
            int i = l-1;
            int j = h+1;
            while (true) {
                do {
                    i++;
                } while (arr[i]<pivot);
                do {
                    j--;
                } while (arr[j]>pivot);
                if(i>=j)
                return j;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
        }

    public static void main(String[]args){
      int arr[] = {4,7,8,5,2,12,95};
      int n= arr.length;
      QuickSort(arr, 0, n-1);
      for(int i=0;i<n;i++){
        System.out.println(arr[i] + " ");
      }
    }
}
