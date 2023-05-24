package adtGeneric;

import java.util.ArrayList;

public class genericClassLab2 {
    public static void main(String[] args) {
        ArrayList<KeyValueGeneric> newKeyGenericList = new ArrayList<>(3);

        KeyValueGeneric entry1 = new KeyValueGeneric("KeyOne", 1);
        KeyValueGeneric entry2 = new KeyValueGeneric("KeyTwo", 2);
        KeyValueGeneric entry3 = new KeyValueGeneric("KeyThree", 3);

        newKeyGenericList.add(entry1);
        newKeyGenericList.add(entry2);
        newKeyGenericList.add(entry3);

        for (Object entries : newKeyGenericList) {
            System.out.println(entries);
        }
    }
}
