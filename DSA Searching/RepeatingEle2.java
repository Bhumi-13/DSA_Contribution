import  java.util.*;
class RepeatingEle2 {
    //1st Method
    /*public static int getRepeat(int arr[],int n){
        int slow = arr[0];
        int fast = arr[0];
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow!=fast);
        slow =  arr[0];
        while (slow!=fast) {
            slow = arr[slow];
            fast = arr[fast];            
        }
        return slow;
    }*/
//apan +1 issiliye kaare agar arr 0 se chalu  hua toh rukega nahi
    public static int getRepeat(int arr[],int n){
        int slow = arr[0]+1;
        int fast = arr[0]+1;
        do {
            slow = arr[slow]+1;
            fast = arr[arr[fast]+1]+1;
        } while (slow!=fast);
        slow =  arr[0]+1;
        while (slow!=fast) {
            slow = arr[slow]+1;
            fast = arr[fast]+1;            
        }
        return slow-1;
    }





    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Rules: 1<=max(arr)<=n-1");
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(getRepeat(arr, n));
    }
}
