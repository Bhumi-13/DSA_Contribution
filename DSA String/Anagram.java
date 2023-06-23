import java.util.*;
class Anagram {
    /*  NAIVE APPROACH
    public static boolean getAnagram(String str1, String str2){
        if(str1.length() != str2.length())
        return false;
        //to covert string into array
        char a1[] =  str1.toCharArray();
        Arrays.sort(a1);
        str1 = new String(a1);

        char a2[] =  str2.toCharArray();
        Arrays.sort(a2);
        str2 = new String(a2);

        return str1.equals(str2);

    }*/

    //EFFICIENT APPROACH
    static final int CHAR = 256;
    public static boolean getAnagram(String str1, String str2){
        if(str1.length() != str2.length())
        return false;
        int count[] = new int[CHAR];

        for(int i=0;i<str1.length();i++){
           count[str1.charAt(i)]++;
           count[str2.charAt(i)]--;
        }

        for(int i=0;i<CHAR;i++){
            if(count[i] != 0)
            return false;
        }
        return true;
    }

    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of two string:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter the two string:");
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(getAnagram(str1, str2));

    }
}
