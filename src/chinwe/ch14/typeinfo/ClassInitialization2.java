package chinwe.ch14.typeinfo;

class DemoData1 {
    static final int myconst = 101;
    static {
        System.out.println("Oops, DemoData1 is initialized!");
    }
}

class DemoData2 {
    static int myconst = 102;
    static {
        System.out.println("Oops, DemoData2 is initialized!");
    }
}

public class ClassInitialization2 {
    public static void main(String[] args) {
        System.out.println(DemoData1.myconst);
        System.out.println(DemoData2.myconst);
    }
}
