import java.util.*;
class TransposeMatrix {
    //NAIVE APPROCH
    /*static int n=4;
    public static void Transpose(int arr[][]){
        int temp[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[i][j]=arr[j][i];
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
        public static void Transpose(int arr[][]){
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int temp =  arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
    public static void main(String[]args){
        int arr[][] = {{1, 2, 3, 4},
    				   {5, 6, 7, 8},
    				   {9, 10, 11, 12},
    				   {13, 14, 15, 16}};
        int n = arr.length;
        Transpose(arr);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
