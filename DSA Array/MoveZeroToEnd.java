import java.lang.*;

class MoveZeroToEnd {
 public static void moveZero(int arr[],int n){
    int count =0;
    for(int i=0;i<n;i++){
        if(arr[i]!=0)

        arr[count ++]= arr[i];
            }
            while(count<n)
            arr[count++]=0;
        }
    
 
    public static void main(String[]args){
     int arr[]={45,85,0,0,21,45,0,99,0};
     int n = arr.length;
     System.out.println("Given array:");
     for(int i=0;i<n;i++){
        System.out.print(arr[i]+ " ");
     }
     System.out.println();
     moveZero(arr, n);
     System.out.println("moved array:");
     for(int i=0;i<n;i++){
        System.out.print(arr[i] + " ");
     }
     System.out.println();
    }
}
