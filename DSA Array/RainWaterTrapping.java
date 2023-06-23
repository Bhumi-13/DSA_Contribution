import java.util.*;
class RainWaterTrapping {
    /*NAIVE SOLUTION 
    public static int Trapping(int arr[],int n){
        int result = 0;
        for(int i=1;i<n-1;i++){
            int Lmax = arr[i];
            for(int j=0;j<i;j++){
                Lmax = Math.max(Lmax,arr[j]);
            }
            int Rmax = arr[i];
            for(int j =i+1;j<n;j++){
                Rmax = Math.max(Rmax,arr[j]);
            }
            result = result + (Math.min(Lmax, Rmax) - arr[i]);
        }
        return result;
    }*/

    //EFFICIENT SOLUTION
    public static int Trapping(int arr[],int n){
        int result =0;
        
        int Lmax[] = new int[n]; 
        int Rmax[] = new int [n];
        Lmax[0] = arr[0];
        for(int i=1;i<n;i++){
            Lmax[i] = Math.max(arr[i],Lmax[i-1]);
        }
        Rmax[n-1] = arr[n-1];
        for(int i =n-2;i>=0;i--){
            Rmax[i] = Math.max(arr[i], Rmax[i+1]);
        }
        for(int i=1;i<n-1;i++){
            result = result + (Math.min(Lmax[i], Rmax[i]) - arr[i]);
        }
        return result;    
    }
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the length of bars:");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("the water capacity is :");
        System.out.print(Trapping(arr, n));
    }
}
