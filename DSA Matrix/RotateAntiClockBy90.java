import java.util.*;
class RotateAntiClockBy90 {
    //NAIVE METHOD
   /*static int n=4;
    public static void Rotate90(int arr[][]){
        int temp[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[n-j-1][i] = arr[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = temp[i][j];
            }
        }
    }*/

    //EFFICIENT METHOD
    static int n=4;
    public static void Rotate90(int arr[][]){
        //first transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //now reverse the columns
        for(int i=0;i<n;i++){
            int low =0;
            int high = n-1;
            while(low<high){
                int temp = arr[low][i];
                arr[low][i] = arr[high][i];
                arr[high][i] = temp;
                low++;
                high--;
            }
        }
    }
    public static void main(String[]args){
        int arr[][] = {{1, 2, 3, 4},
    				   {5, 6, 7, 8},
    				   {9, 10, 11, 12},
    				   {13, 14, 15, 16}};
        int n = arr.length;
        Rotate90(arr);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
