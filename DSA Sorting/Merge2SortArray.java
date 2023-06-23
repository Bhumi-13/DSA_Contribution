import java.util.*;
class Merge2SortArray {
    //Naive method
/*public static void merge(int arr1[],int arr2[]){
    int n1 = arr1.length;
    int n2 = arr2.length;
    int n = n1+n2;
    int arr[] = new int[n];
    for(int i=0;i<n1;i++){
        arr[i]= arr1[i];
    }
    for(int i=0;i<n2;i++){
        arr[n1+i] = arr2[i];
    }
    Arrays.sort(arr);
    for(int i=0;i<n;i++)
    System.out.println(arr[i] + " ");
}*/

//EFFICIENT METHOD
public static void merge(int arr1[],int arr2[]){
    int n1 = arr1.length;
    int n2 = arr2.length;
    int i=0; 
    int j =0;
    while(i<n1 && j<n2){
        if(arr1[i]<=arr2[j]){
            System.out.println(arr1[i] + " ");
            i++;
        }
        else
        System.out.println(arr2[j] + " ");
        j++;
    }
    while(i<n1){
        System.out.println(arr1[i] + " ");
        i++;
    }
    while(j<n2){
        System.out.println(arr2[j] + " ");
        j++;
    }
}
    
    public static void main(String[]args){
      int arr1[] =  {10,15,20,20};
      int arr2[] = {1,12};
      int n1 = arr1.length;
      int n2 = arr2.length;
      merge(arr1, arr2);
      
    }
}
