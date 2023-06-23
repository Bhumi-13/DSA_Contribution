import java.util.*;
class PrefixSum {
    /*public static int getSum(int arr[],int n, int start,int end){
            int res =0;
            for(int i=start;i<end;i++){
                res += arr[i];
            }
            return res;
    }*/


    //EFFICIENT METHOD
    public static int getSum(int pSum[],int l,int r){
        
        if(l==0)
        return pSum[r];
        return pSum[r] - pSum[l-1];
    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element in the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //PREPROCESSING PART FOR EFFICIENT METHOD
        int pSum[] = new int[n];
        pSum[0] = arr[0];
        for(int i =1;i<n;i++){
            pSum[i]= pSum[i-1] + arr[i];
        }


        System.out.println("Enter the Queries:");
        System.out.println(getSum(pSum, 0, 4));
        System.out.println(getSum(pSum,  3, 5));
    }
}
