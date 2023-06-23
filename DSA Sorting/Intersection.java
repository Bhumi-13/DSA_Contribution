import java.util.*;

import javax.lang.model.util.ElementScanner14;
class Intersection {
    /*public static void intersect(int arr1[],int arr2[]){
        int n1 =  arr1.length;
        int n2 = arr2.length;
        for(int i=0;i<n1;i++){
            if(i>0 && arr1[i]== arr1[i-1])
            continue;
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i] + " ");
                    break;
                }
            }
        }
    }  */

    //EFFICIENT METHOD
    public static void intersect(int arr1[],int arr2[]){
        int n1 =  arr1.length;
        int n2 = arr2.length;
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(i<0  && arr1[i]== arr1[i-1]){
                i++;
                continue;
            }
            if(arr1[i]<arr2[j])
            i++;
            else if(arr1[i]>arr2[j])
            j++;
            else 
            System.out.println(arr1[i] + " ");
            i++;
            j++; 
            
        }
    }

    public static void main(String[]args){
        int arr1[] = {1,20,20,40,60};
        int arr2[] = {2,20,20,20};
        int n1 =  arr1.length;
        int n2 = arr2.length;
        intersect(arr1, arr2);
    }
}
