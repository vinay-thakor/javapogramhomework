
import java.util.ArrayList;

//  A Java program to test an array list is empty or not.
public class JavaPro05 {
    public static void main (String[] args){
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        list.add("A");
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());

    }
}

