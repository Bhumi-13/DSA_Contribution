import java.util.*;
class StockBuySell1 {
    //NAIVE SOLUTION
    /*  public static int MaxProfit(int arr[],int start, int end){
        if(end<= start)
        return 0;
        int profit = 0;
        for(int i=start;i<end;i++){
            for(int j=i+1;j<=end;j++){
                if(arr[j]>arr[i]){
                    int curr_profit = arr[j] - arr[i] +
                                      MaxProfit(arr, start, i-1)+
                                      MaxProfit(arr, j+1, end);
                    profit = Math.max(profit,curr_profit);
                }
            }
        }
        return profit;

    }*/

    //EFFICIENT METHOD
    public static int MaxProfit(int arr[],int n){
        int profit = 0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                profit = profit + (arr[i]-arr[i-1]);

            }
        }
        return profit;
    }


public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
   System.out.println("enter the array length:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the numbers in the array");
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
    System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println(MaxProfit(arr,n));
}

}
