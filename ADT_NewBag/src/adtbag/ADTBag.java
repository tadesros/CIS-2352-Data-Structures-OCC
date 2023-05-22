package adtbag;

import java.util.ArrayList;

public class ADTBag {


    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();
        //Generic type compile time type checking no casting
        //with generic, you get compile time checking of the T type
        GenericTest<String> course = new GenericTest<>("CIS","2353");
        System.out.println(course);
        //Non Generic Type
        //with objects, everything is an object
        ObjectTest otherCourse = new ObjectTest("CIS",2151);
        System.out.println(otherCourse);
    }

}
