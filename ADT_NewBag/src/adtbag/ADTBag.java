package adtbag;

import java.util.ArrayList;

public class ADTBag {

    public static void main(String[] args)
    {
        //ArrayList<String> names = new ArrayList<>();
        //Generic type compile time type checking no casting
        //with generic, you get compile time checking of the T type
        GenericTest<String> course = new GenericTest<>("CIS","2353");
        System.out.println(course);
        //Non Generic Type
        //with objects, everything is an object
        ObjectTest otherCourse = new ObjectTest("CIS",2151);
        System.out.println(otherCourse);

        BagInterface<String> names = new BagArray<>(10);

        names.add("Eric");
        names.add("Jasmine");
        names.add("Joy");
        names.add("Jeb");
        names.add("Jenavieve");
        names.add("Journey");
        names.add("Jubille");
        names.add("Eric");

        //this should work with String[] - not sure why it's not
        Object[] result = names.toArray();

        for(Object name : result)
        {
            System.out.println(name);
        }
        System.out.println(names.getFrequencyOf("Eric"));


        BagArray<String> bag = new BagArray<>();
        bag.add("test");
        int expectedCurrentSize = 1;

        int actualCurrentSize = bag.getCurrentSize();

        System.out.println("CurrentSIze expected and actual: "+expectedCurrentSize + " " + actualCurrentSize);

        boolean actualIsEmpty = bag.isEmpty();

        System.out.println("EMpty?  false actual:" + actualIsEmpty);

        String expectedValue2 = "test";

        int expectedCurrentSize2 = 2;

        boolean addResult2 = bag.add("test");
        int actualCurrentSize2 = bag.getCurrentSize();

        System.out.println("expected and actual size:"+ expectedCurrentSize2 + " " + actualCurrentSize2);

        Object[] result2 = bag.toArray();

        System.out.println(result2);


        BagLinkedObjects<String> linkedNames = new BagLinkedObjects<>();
        linkedNames.add("Eric");
        linkedNames.add("Jasmine");
        linkedNames.add("Joy");
        linkedNames.add("Jeb");
        linkedNames.add("Jenavieve");
        linkedNames.add("Journey");
        linkedNames.add("Jubilee");
        linkedNames.add("Eric");

        // this should work with String[] - not sure why it's not
        result = linkedNames.toArray();

        for( Object name : result){
            String actuallyThisTypePlease = (String)name;
            System.out.println(actuallyThisTypePlease);
        }

    }
}
