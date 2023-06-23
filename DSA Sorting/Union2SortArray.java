import java.util.*;
class Union2SortArray {
    /*public static void union(int arr1[],int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n= n1+n2;
        int arr[] = new int[n];

        for(int i=0;i<n1;i++){
            arr[i] = arr1[i];
        }
        
        for(int i=0;i<n2;i++){
            arr[n1+i] = arr2[i];
        }
        Arrays.sort(arr);

        //remove duplicates from the array
        for(int i=0;i<n;i++){
            if(i==0 || arr[i] != arr[i-1])
            System.out.println(arr[i] + " ");
        }
    }*/

    public static void union(int arr1[],int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(i>0 && arr1[i]==arr1[i-1]){
            i++;
            continue;}
            if(j>0 && arr2[j]==arr2[j-1]){
                j++;
                continue;
            }
            if(arr1[i]<arr2[j]){
                System.out.println(arr1[i] + " ");
                i++;
            }
            else if(arr1[i]>arr2[j]){
                System.out.println(arr2[j] + " ");
                j++;
            }
            else
            {
                System.out.println(arr1[i] + " ");
                i++;
                j++;
            }
        }
        while(i<n1){
            if(i>0 && arr1[i]!=arr1[i-1]){
                System.out.println(arr1[i] + " ");
                i++;
            }
        }
        while(j<n2){
            if(j>0 && arr2[j]!=arr2[j-1]){
                System.out.println(arr2[j] + " ");
                j++;
            }
        }
    }

    public static void main(String[]args){
        int arr1[] ={10,20,20};
        int arr2[] = {5,20,40,40};
       
        int n1 = arr1.length;
        int n2 = arr2.length;
        union(arr1, arr2);
       
        
    }
}
