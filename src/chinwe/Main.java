package chinwe;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Class c = boolean.class;
        Class c2 = Boolean.TYPE;
        System.out.println(c.getCanonicalName());
        System.out.println(c2.getCanonicalName());
    }
}
