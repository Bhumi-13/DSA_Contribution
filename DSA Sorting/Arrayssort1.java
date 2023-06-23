//Non primitive tyes  ----array of object(interger,string,...)
import java.util.*;
import java.util.Arrays;
public class Point implements Comparable<Point>
{
    int x,y;
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int CompareTo(Point b){
        return this.x - b.x;
    }
}
public class Arrayssort1 {
    public static void main(String[]args){
        Point arr[] = {new Point(10,20), new Point(3, 5)};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].x + " " + arr[i].y);
        }
    }
}
