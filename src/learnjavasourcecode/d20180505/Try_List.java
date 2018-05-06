package learnjavasourcecode.d20180505;

import java.util.ArrayList;
import java.util.List;

public class Try_List {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        Integer[] b = new Integer[3];
        System.out.println(b);
        a.toArray(b);
        System.out.println(b[1]);
    }
}
