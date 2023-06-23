import java.util.*;
class LeftRepeatingElement {
    /*NAIVE METHOD 
    public static int leftmost(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j))
                return i;
            }
        }
        return -1;
    }*/

    //better solution 1
    /*static final int CHAR = 256;
    public static int leftmost(String str){
        int count[] = new int[CHAR];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)]>1)
            return i;
        }
        return -1;
    }*/ 
    
    //EFFICIENT METHOD 1
    /*static final int CHAR = 256;
    public static int leftmost(String str){
        int Findex[] = new int[CHAR];
        Arrays.fill(Findex,-1);
        int res = Integer.MAX_VALUE;  //making infinity

        for(int i=0;i<str.length();i++){
            int fi = Findex[str.charAt(i)];
            if(fi==-1)
            Findex[str.charAt(i)] =i;
            else 
            res = Math.min(res, fi);
        }
        return (res==Integer.MAX_VALUE)?-1:res;
    }*/

    //EFFICIENT METHOD 2
    static final int CHAR = 256;
    public static int leftmost(String str){
        boolean visited[] = new boolean[CHAR];
        int res =-1;
        
        for(int i=str.length()-1;i>=0;i--){
            if(visited[str.charAt(i)])
            res = i;
            else
            visited[str.charAt(i)]=true;
        }
        return res;
    }

    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of string:");
        int n = sc.nextInt();
        System.out.println("Enter the string:");
        String str = sc.next();
        leftmost(str);
        System.out.println(leftmost(str));
        
    }
}
