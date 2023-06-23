import java.util.*;
class PagesMinAllo {
    //NAIVE METHOD -------------RECURSION
   /*public static int getMaxPage(int arr[],int n,int k){
        if(k==1)
        return sum(arr,0,n-1);
        if(n==1)
        return arr[0];

        int  res = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            res = Math.min(res,Math.max(getMaxPage(arr, i, k-1),sum(arr,i,n-1)));
        }
            return  res;
        }
    

    public static int sum(int arr[],int b,int e){
        int r =0;
        for(int i=b;i<= e;i++){
            r += arr[i];
        }
            return r;
    }*/

    //EFFICIENT SOLUTION -------------BINARY SEARCH
    public static int getMaxPage(int arr[],int n,int k){
            int sum =0;
            int max =0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }

        int low = max;
        int high = sum;
        int res =0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isFeasible(arr,n,k,mid))
            {
                res = mid;
                high = mid - 1;
            }
            else
            low = mid + 1;
        }
        return res;
    }

    public static Boolean isFeasible(int arr[],int n,int k,int ans){
        int req = 1;
        int sum = 0;
        for(int i=0;i<n;i++){
            if(sum + arr[i] > ans){
                req++;
                sum = arr[i];
            }
            else
            sum += arr[i];
        }
        return (req <= k);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array book:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Rules: 1<=max(arr)<=n-1");
        System.out.println("Enter the pages of book:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter no of student:(k)");
        int k  = sc.nextInt();
        System.out.println(getMaxPage(arr, n, k));
    }
}
