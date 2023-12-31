import java.util.*;
class MaxAppear {
    /* NAIVE METHOD

    public static int maxAppear(int left[], int right[], int n){
        int freq[] = new int[100];
        for(int i=0;i<n;i++){
            for(int j=left[i];j<=right[i];j++){
                freq[j] += 1;
            }
        }
        int res = 0;
        for(int i=1;i<100;i++){
            if(freq[i]>freq[res])
            res = i;
        }
        return res;
    }*/


    //EFFICIENT METHOD
    public static int maxAppear(int left[],int right[],int n){
        int freq[] = new int[101];
        for(int i=0;i<n;i++){
            freq[left[i]]++;
            freq[right[i]+1]--;
        }
        int res = 0;
        for(int i=1;i<100;i++){
            freq[i] = freq[i-1] + freq[i];
        
        if(freq[i]>freq[res])
        res = i;
        }
        return res;
    }


    public static void main(String[]args){
        int[] left = {2,4,8,6};
        int[] right = {8,7,10,7};
        int n = left.length;
        System.out.println(maxAppear(left, right, n));
        

    }
}
