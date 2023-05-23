package adtGeneric;

public class GenericClassLab1 {

    public static void main(String[] args)
    {
       GenericClass<String> myGenericClass = new GenericClass<>("Key","Value");

       System.out.println(myGenericClass);
    }
}
