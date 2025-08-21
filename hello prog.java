import java.util.ArrayList;
import java.util.Collection;

public class hello_prog {
 
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("rahul");
        list.add("rohit");
        list.add("roshan");
        Collections.sort(list,(a,b)->a.CompareTo(b));
        System.out.println(list);
    }
 }