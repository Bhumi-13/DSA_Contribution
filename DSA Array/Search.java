import java.util.*;

class Search
{ 
    static int search(int arr[], int n, int x)
    {
    	for(int i = 0; i < n; i++)
    	{
    		if(arr[i] == x)
    			return i;
    	}

    	return -1;
    } 
    public static void main(String args[]) 
    { 
       int arr[] = {20, 5, 7, 25, 78 ,45, 99};
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number to be searched:");
        int x = sc.nextInt();
       System.out.println(search(arr, arr.length, x));
    } 
}
