import java.util.Scanner;
class RotatedArray{
    //NAIVE APROACH
/*public static int Rotated(int arr[],int x,int n){
for(int i=0;i<n;i++){
    if(arr[i]==x)
    return i;
}
   return -1;
}*/

//EFFICIENT APPROACH
public static int Rotated(int arr[],int x,int n){
    int low = 0;
    int high = n-1;
    while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid] == x)
        return mid;

        if(arr[low]<=arr[mid]){
            if(x>=arr[low] && x<arr[mid])
            high = mid -1;
        else
            low = mid + 1;    
        }

        else{
            if(x>arr[mid] && x<=arr[high])
            low = mid+1;
            else
            high = mid -1;
        }

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
   System.out.println(Rotated(arr,x,n));
}
}