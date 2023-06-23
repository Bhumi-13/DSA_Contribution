import java.util.Scanner;
class  InfiniteArraySearch{
public static int Search(int arr[],int x){
    if(arr[0]==x)
    return 0;
    int i =1;
    while(arr[i]<x){
        i=i*2;
        if(arr[i]==x)
        return i;
    }
   return BinarySearch(arr,x,i/2+1,i-1);
}

public static int BinarySearch(int arr[],int x,int low,int high){

    while(low<=high){
        int mid = (low+high)/2;
        if(mid==x)
        return mid;
        else if(mid>x)
        low =mid+1;
        else
        high = mid-1;
    }
    return -1;
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
    System.out.println("Enter the element to be searched:");
    int x = sc.nextInt();
    System.out.println(Search(arr,x));

    }
}