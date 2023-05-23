package Test;

import adtbag.BagLinkedObjects;

import static org.junit.jupiter.api.Assertions.*;

class BagLinkedObjectsTest {

    @org.junit.jupiter.api.Test
    void getCurrentSize() {

        // AAA format

        // Arrange - setup all the variables need to test, included expected results
        BagLinkedObjects<String> bag = new BagLinkedObjects<>();
        bag.add("test");
        int expectedCurrentSize = 1;

        // Act - call the code we're testing - get actual results
        int actualCurrentSize = bag.getCurrentSize();

        // Assert - did we get what we expected?
        assertEquals(expectedCurrentSize, actualCurrentSize);


    }

    @org.junit.jupiter.api.Test
    void isEmpty() {

        // AAA format

        // Arrange - setup all the variables need to test, included expected results
        BagLinkedObjects<String> bag = new BagLinkedObjects<>();
        bag.add("test");

        // Act - call the code we're testing - get actual results
        boolean actualIsEmtpy = bag.isEmpty();

        // Assert - did we get what we expected?
        assertFalse(actualIsEmtpy);
    }

    @org.junit.jupiter.api.Test
    void add() {
        // AAA format

        // Arrange - setup all the variables need to test, included expected results
        BagLinkedObjects<String> bag = new BagLinkedObjects<>();
        String expectedValue = "test";
        int expectedCurrentSize = 1;

        // Act - call the code we're testing - get actual results
        boolean addResult = bag.add("test");
        int actualCurrentSize = bag.getCurrentSize();
        Object[] result = bag.toArray();

        // Assert - did we get what we expected?
        assertTrue(addResult);
        assertEquals(expectedCurrentSize, actualCurrentSize);
        assertEquals(expectedValue, result[0]);
    }

    @org.junit.jupiter.api.Test
    void remove() {
    }

    @org.junit.jupiter.api.Test
    void testRemove() {
    }

    @org.junit.jupiter.api.Test
    void clear() {
    }

    @org.junit.jupiter.api.Test
    void getFrequencyOf() {
    }

    @org.junit.jupiter.api.Test
    void contains() {
    }

    @org.junit.jupiter.api.Test
    void toArray() {
    }
}