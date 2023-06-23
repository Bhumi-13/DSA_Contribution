import java.util.Scanner;
 class TwoPointer{
    //NAIVE APPROACH
    /*public static boolean TwoPointer(int arr[],int n,int x){
        for(int i=0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if (arr[i] + arr[j] == x)
                return true;
            }
        }
        return false;
    }*/

    //EFFICIENT SOLUTION
    public static boolean getPair(int arr[],int n,int x){
        int i=0;
        int j = n-1;
        while(i<j){
            if((arr[i] + arr[j]) == x)
            return true;
            else if((arr[i] + arr[j]) < x)
            i++;
            else 
            j--;
        }
        return false;
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
        System.out.println("Enter the sum:");
        int x = sc.nextInt();
        System.out.println(getPair(arr,n,x));

    }
 }