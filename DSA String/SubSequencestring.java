import  java.util.*;
class SubSequencestring {
    //ITERATIVE SOLUTION
/*public static boolean isSubString(String str1, String str2){
     int j=0;
     for(int i=0;i<str1.length() && j<str2.length();i++){
        if(str1.charAt(i)==str2.charAt(j))
        j++;
     }
     return j== str2.length();
}*/

//RECURSIVE SOLUTION
public static boolean SubSequencestring(String str1, String str2, int n, int m){
    if(m==0)
    return  true;
    if(n==0)
    return false;
    if(str1.charAt(n-1)==str2.charAt(m-1))
    return SubSequencestring(str1, str2, n-1, m-1);
    else
    return SubSequencestring(str1, str2, n-1, m);
}
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two length of string:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter the two strings:");
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(SubSequencestring(str1, str2,n,m));
    }
}
