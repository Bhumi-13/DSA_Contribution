import java.util.*;
class LeftNonRepeating {
    /* NAIVE APPOARCH   -------------------------O(n^2)
 public static int leftNonRepeat(String str){
    for(int i=0;i<str.length();i++){
        boolean flag = false;
        for(int j=0;j<str.length();j++){
            if(i!=j && str.charAt(i) == str.charAt(j)){
                flag = true;
                break;
            }
        }
        if(flag == false)
        return i;
    }
    return -1;
 }*/

 //EFFICIENT SOLUTION-1
 /*static final int CHAR = 256;
 public static int leftNonRepeat(String str){
    int count[] = new int[CHAR];

    for(int i=0;i<str.length();i++){
        count[str.charAt(i)]++;
    }

    for(int i=0;i<str.length();i++){
        if(count[str.charAt(i)]==1)
        return i;
    }
    return -1;
 }*/


 //EFFICIENT-2
 static final int CHAR = 256;
 public static int leftNonRepeat(String str){
    int fi[] =  new int[CHAR];
    Arrays.fill(fi,-1);

    for(int i=0;i<str.length();i++){
        if(fi[str.charAt(i)]==-1)
        fi[str.charAt(i)]=i;
        else
        fi[str.charAt(i)]=-2;
    }
    
    int res = Integer.MAX_VALUE;
    for(int i=0;i<CHAR;i++){hf(fi[i]>=0)            
    }
        return (res== Integer.MAX_VALUE)?-1:res;
    
 }
    
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.next();
        System.out.println(leftNonRepeat(str));    
    }
}
