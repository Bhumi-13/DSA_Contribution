import java.util.*;
class ConsecutiveFlip{
    public static void getFlip(int arr[],int n){
        
        for(int i=1;i<n;i++){
        if(arr[i]!=arr[i-1]){
            if(arr[i]!=arr[0])
            System.out.print("From" + i + "to");
            else
            System.out.println(i-1);
        }

        } 
        if(arr[n-1]!= arr[0])
        System.out.println(n-1);
    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the binary array element:");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Binary array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("The minimum no. of flips are:");
        getFlip(arr,n);

    }
}