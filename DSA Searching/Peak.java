import java.util.Scanner;
class Peak{
    //NAIVE APPROACH ---linear
   /*  public static int Peak(int arr[],int n){
        if(n==1)
        return arr[0];         //if only 1 element
        if(arr[0]>=arr[1])
        return arr[0];         //for 1st element
        if(arr[n-1]>=arr[n-2])
        return arr[n-1];       //for last element
        //for remaining elements
        for(int i=1;i<n-1;i++){
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
            return arr[i];
        }
        return -1;
    }*/

    //EFFICIENT APPROACH ----BINARY
    public static int Peak(int arr[],int n){
        int low =0;
        int high = n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if((mid==0 || arr[mid-1]<=arr[mid]) &&
              (mid==n-1 || arr[mid+1]<= arr[mid]))
              return mid;
              if(mid>0 && arr[mid-1]>=arr[mid])
              high = mid -1;
              else
              low = mid +1;
        }
        return -1;
    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an Binary array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the Binary array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Peak element:");
        System.out.println(Peak(arr,n));
    }
}