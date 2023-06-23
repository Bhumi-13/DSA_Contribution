import java.util.*;
class MajorityElement {
    public static int   Majority(int arr[],int n){
        
        for(int i=0;i<n;i++){
            int count =1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j])
                count++;
            }
            if(count>n/2)
            return i;
        }
       return -1;
    }
    


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of an array:");
    int n = sc.nextInt();
    System.out.println("Enter the elements in the array:");
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println("The majority element index is:");
    System.out.println( Majority(arr, n));
   

    }
}
