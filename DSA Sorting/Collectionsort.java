import java.util.*;
public class Collectionsort{
    public static void main(String[]args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(199);
        list.add(998);
        list.add(34);
        list.add(9);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
