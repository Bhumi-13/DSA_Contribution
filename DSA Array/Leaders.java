import java.lang.*;
class Leaders {
    //NAIVE METHOD
    /*public static void leaders(int arr[],int n){
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    flag = true;
                    break;
                }
                if(flag == false){
                    System.out.println(arr[i]);
                }
            }
        }
    }*/

    //EFFICIENT METHOD
    public static void leaders(int arr[],int n){
        int curr_leader = arr[n-1];
        System.out.println(curr_leader);
        for(int i=n-2;i>=0;i--){
            if(curr_leader<arr[i]){
                curr_leader = arr[i];
                System.out.println(curr_leader);
            }
        }
    }

    public static void main(String[]args){
        int arr[] = {7, 10, 4, 10, 6, 5, 2};
        int n = arr.length;
        System.out.println("Given array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        leaders(arr, n);
       
    }
}
