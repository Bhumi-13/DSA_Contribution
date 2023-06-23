import  java.util.*;
class lomatoPartition {
    //ASSUME PIVOT TO BE LAST ELEMENT
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
        int arr[] = {10,80,30,90,40,50,70};
        int n = arr.length;
        lomato(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
