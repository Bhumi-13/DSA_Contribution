class PalindromeString {
    /*public static boolean isPalindrome(String str){
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }*/

    //EFFICIENT SOLUTION
    public static boolean  isPalindrome(String str){
        int begin=0;
        int end = str.length()-1;
        while(begin<end){
            if(str.charAt(begin)!=str.charAt(end))
            return false;
            begin++;
            end--;
        }
        return true;
    }
public static void main(String[]args){
   String str = "ABBA";
   System.out.println(isPalindrome(str));
   

}    
}
