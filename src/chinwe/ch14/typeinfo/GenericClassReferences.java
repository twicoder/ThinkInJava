package chinwe.ch14.typeinfo;

public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = intClass;
        intClass = double.class;
//        genericIntClass = double.class;

//        Class<Number> genericNumberClass = int.class;

          Class<?> anyClass = int.class;
          anyClass = double.class;

    }

}
