import java.util.*;
public class Triplet {
    //NAIVE APPRAOCH
    /*public static Boolean getTriplet(int arr[],int n,int x){
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==x)
                    return true;
                }
            }
        }
        return false;
    }*/

    //EFFICIENT APPROACH
    public static Boolean getPair(int arr[],int n,int x,int si){
        int i = si;
        int j= n-1;
        while(i<j){
            if(arr[i]+arr[j]==x)
            return true;
            else if(arr[i]+arr[j]>x)
            j--;
            else 
            i++;
        }
        return false;
    }
    
    public static Boolean getTriplet(int arr[],int n,int x){
        for(int i=0;i<n-2;i++){
            if(getPair(arr, n, x-arr[i], i+1))
            return true;
        }
        return false;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the sum:");
        int x = sc.nextInt();
        System.out.println(getTriplet(arr, n, x));

    }
}
