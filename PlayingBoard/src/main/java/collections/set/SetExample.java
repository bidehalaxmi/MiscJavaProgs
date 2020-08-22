package collections.set;

import com.sun.deploy.ui.DialogTemplate;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> s1 = new TreeSet<>();

        s1.add("1");
        s1.add("one");
        s1.add("one");
        s1.add("two");
        s1.add("three");

        for (String item:s1) {
            System.out.println(item);
        }
    }
}
