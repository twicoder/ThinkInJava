package learnjavasourcecode.d20180505;

import java.util.Objects;

public class Try_Objects {
    public static void main(String[] args) {
        String a = "Hello World";
        System.out.println(Objects.toString(a));
        String b = null;
        System.out.println(Objects.toString(b,"The default value"));
    }
}
