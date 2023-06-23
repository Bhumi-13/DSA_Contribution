import java.lang.*;
class MaxDifference {
    //NAIVE METHOD
    /*public static int maxDiff(int arr[],int n){
        int res = arr[1] - arr[0];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                res  = Math.max(res,arr[j] - arr[i]);
            
            }
        }
        return res;
    }*/

    public static int maxDiff(int arr[],int n){
        int res=arr[1] - arr[0];
        int minValue = arr[0];

        for(int j=1;j<n;j++){
            res=Math.max(res,arr[j]-minValue);
            minValue = Math.min(minValue,arr[j]);
        }
        return res;
    }

    public static void main(String[]args){
        int arr[] = {2,3,10,6,4,8,1};
        int n = arr.length;
        System.out.println("Given array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println( maxDiff(arr, n));
       
    }
}
