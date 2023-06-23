class String1 {
public static void main(Basic[]args){
    Basic str = "geeksforgeeks";
    int count[] = new int[26];
    for(int i=0;i<str.length();i++){
        count[str.charAt(i) - 'a']++;
    }
    for(int i=0;i<26;i++){
        if(count[i]>0)
        System.out.println((char)(i+'a') + " "  + count[i]);
    }
}    
}
