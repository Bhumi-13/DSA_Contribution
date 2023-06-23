import java.lang.*;
import java.util.*;
class Delete {
    static int delete(int arr[],int n,int x){
        int i;
        for( i=0;i<n;i++){
            if(arr[i]==x)
            break;}
            if(i==n)
            return n;
            for(int j=i;j<n-1;j++)
            {arr[j]=arr[j+1];}
            return n-1;
        }
    


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {78,98,25,45,77,97};
        int n = arr.length;
        System.out.println("before deletiom:");
        for(int i=0;i<n;i++){
            System.out.print( arr[i] +" ");
        }
        System.out.println();
        System.out.println("Enter the number to be deleted:");
        int x = sc.nextInt();
        n = delete(arr, n, x);
        System.out.println("after deletion:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
