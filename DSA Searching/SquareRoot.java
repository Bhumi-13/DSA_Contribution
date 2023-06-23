import java.util.Scanner;
class SquareRoot{
    //NAIVE SOLUTION
    /*public static int sqRoot(int x){
        int i=1;
        while(i*i<=x)
        i++;
        return (i-1);

    }*/

    public static  int sqRoot(int x){
        int low = 1;
        int high = x;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            int mSq = mid*mid;
            if(mSq == x)
            return mid;
            else if(mSq > x)
            high = mid - 1;
            else{
            low = mid + 1;
            ans = mid;
        }
    }
    return ans;
    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int x = sc.nextInt();
        System.out.println("Print the square root:");
        System.out.println(sqRoot(x));
}
}