import java.util.*;
class RepeatingEleRules {
    //SUPER NAIVE SOLUTION -------O(n^2)
    /*public static int getRepeatEle(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j])
                return arr[i];
            }
        }
        return -1;
    }*/

    //NAIVE APPROCH --------------O(nlogn)
    //not allowed bcuz it modifies the array
    /*public static int getRepeatEle(int arr[],int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1])
            return arr[i];
        }
        return -1;
    }*/


    //EFFICIENT APPROCH 
    public static int getRepeatEle(int arr[],int n){
        boolean visited[]  = new boolean[n];

        for(int i=0;i<n;i++){
            if(visited[arr[i]])
            return arr[i];
            visited[arr[i]]=true;
        }
        return -1;
    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Rules: 0<=max(arr)<=n-2");
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(getRepeatEle(arr, n));
    }
}
