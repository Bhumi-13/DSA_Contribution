import java.util.*;
class Equilibrium {
    //NAIVE METHOD
    /*public static boolean equiPoint(int arr[],int n){
        for(int i=0;i<n;i++){
            int ls=0;
            int Rs=0;
            for(int j=0;j<i;j++){
                ls += arr[j];
            }
            for(int k=i+1;k<n;k++){
                Rs += arr[k];
            }
            if(ls == Rs)
            return true;

        }
        return false;

    }*/


    //EFFICIENT METHOD
    public static boolean equiPoint(int arr[],int n){
        int rs =0;
        for(int i=0;i<n;i++){
            rs += arr[i];
        }
        int ls=0;
        for(int i=0;i<n;i++){
            rs -= arr[i];
        
        if(rs == ls)
        return true;
        ls += arr[i];
    }
    return false;
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
        System.out.println("Equilibrium exixts or not:");
        System.out.println(equiPoint(arr, n));


    }
}
