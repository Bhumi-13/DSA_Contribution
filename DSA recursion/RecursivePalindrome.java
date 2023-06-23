public class RecursivePalindrome {
public static boolean inPalindrome(String str, int start,int end){
if(start>= end)
return true;
return(str.charAt(start)==str.charAt(end))&& inPalindrome(str, start+1, end-1);
    }
     

    public static void main(String[]args){
        String str = "aabbcbbaa";
    
        System.out.println(inPalindrome(str,0,str.length()-1));
            
    }

}
//Time complexity is O(n).