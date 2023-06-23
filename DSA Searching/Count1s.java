import java.util.Scanner;
class Count1s{
    public static int Count(int arr[],int n){
        int low =0;
        int high =n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==0)     //bcuz 0<1 in binary
            low = mid+1;
            else{
                if(mid==0 || arr[mid-1]!= arr[mid])
                return (n-mid);
                else
               high =mid-1;
            }
        }
        return 0;
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
        System.out.println(Count(arr,n));
}
}