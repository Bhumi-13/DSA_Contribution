import java.io.*;
import java.lang.Character.Subset;
import java.util.*;

public class RecursiveSubSet{
    public static void SubSet(String s , String current,int i){
        if(i==s.length()){
            System.out.println(current + " ");
            return;
       }
        SubSet(s, current,i+1);
        SubSet(s, current+s.charAt(i),i+1);


    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string for subset:");
        String s = sc.nextLine();
        SubSet(s," ",0);


    }
}