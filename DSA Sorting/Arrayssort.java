//primitive types ---int,char
import java.util.Scanner;
import java.util.Arrays;
public class Arrayssort{
    public static void main(String[]args){
        int arr1[] = {5,20,12,30};
        char arr2[] = {'B','B','A','C','A'};
        int arr3[] = {2,44,5,78,90,67,55,99};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        //only sort these element remains same
        Arrays.sort(arr3, 1, 5); 
        System.out.println(Arrays.toString(arr3));
    }

}