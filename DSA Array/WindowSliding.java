import java.util.*;;
class WindowSliding {
    //NAIVE METHOD
     /*public static int Windowslide(int arr[],int n,int k){
        int res = Integer.MIN_VALUE; //res -infinite ho gaya
        for(int i=0;i+k-1<n;i++){  //i+k-1 it will start from k only
            int curr =0;
            for(int j=0;j<k;j++){
                curr += arr[i+j];  //k element
            }
            res = Math.max(res, curr);
        }
        return res;
     }*/

     public static int Windowslide(int arr[],int n,int k){
        int curr = 0;
        for(int i=0;i<k;i++)
            curr += arr[i];
            int res = curr;
        for(int i=k;i<n;i++){
            curr = curr + arr[i] - arr[i-k];
            res = Math.max(res, curr);
        }
        return res;
        
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
        System.out.println("Enter the values of k:");
        int k = sc.nextInt();
        System.out.println("Max sum cc to window sliding problem is");
       
        System.out.println( Windowslide(arr, n, k));
    }
}
