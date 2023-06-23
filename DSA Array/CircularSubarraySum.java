import java.util.*;;

class CircularSubarraySum {
    //NAIVE METHOD
    /*public static int MaxCircularSubarray(int arr[],int n){
        int result = arr[0];
        for(int i=0;i<n;i++){
            int curr_max  = arr[i];
            int curr_sum = arr[i];
            for(int j=1;j<n;j++){
                int index = (i+j)%n;   //------arithematic for circular
                curr_sum += arr[index];
                curr_max = Math.max(curr_max, curr_sum);
            }
            result = Math.max(curr_max, result);
        }
return result;
    }*/

    //EFFICIENT METHOD
    public static int MaxSum(int arr[],int n){
        int res = arr[0];
        int MaxEnding = arr[0];
        for(int i=1;i<n;i++){
            MaxEnding = Math.max(MaxEnding + arr[i], arr[i]);
            res = Math.max(MaxEnding, res);
                }
                return res;
    }
    public static int MaxCircularSubarray(int arr[],int n){
        int max_normal = MaxSum(arr, n);
        if(max_normal < 0)
        return max_normal;

        int arr_sum = 0;
        for(int i=0;i<n;i++){
            arr_sum += arr[i];
            arr[i] =-arr[i]; //inverting the array
        }
        int max_circular = arr_sum + MaxSum(arr, n);
        return  Math.max(max_normal, max_circular);
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
        System.out.println("the maximum sum of circular subarray is:");
        System.out.println(MaxCircularSubarray(arr, n));
    }
}
