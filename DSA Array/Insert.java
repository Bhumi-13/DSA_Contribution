import java.util.*;
import java.lang.*;

 class Insert {
 static int insert(int arr[], int n, int x,int cap, int pos)
    {
        if(n==cap)
        return n;
        
        int indx = pos - 1;
        
        for(int i = n-1; i >=indx; i--)
            {arr[i+1]= arr[i];}
            arr[indx]=x;
            return n+1;
        
             }
                
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1]  = 23;
        arr[2] = 67;
        int n= 3;
        int cap = 5;
        System.out.println("Enter the position and number to be inserted:");
        
       
        int pos = sc.nextInt();
        int x = sc.nextInt(); 

        System.out.println("Printing an array before insertion");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

       n = insert(arr,n,x,cap,pos);
       
       System.out.println("printing an array after  insertion:");
      
       for(int i =0;i<n;i++){
        System.out.print(arr[i]+ " ");
       }
    }
 }
