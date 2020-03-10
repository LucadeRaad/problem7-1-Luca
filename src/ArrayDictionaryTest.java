import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayDictionaryTest {
    @Test
    public void demo() {
        int testSize = 5;
        ArrayDictionary dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(2, 82));
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(7, 87));
        System.out.println(dict);
    }

    @Test
    public void remove() {
        // The test cases for both remove and contains are identical. This is because they are both triggered on whether there is an element
        // with the right key for whether they return a boolean or not.
        int[] testSizes = {
                0, 0, 0,
                1, 1,
                2, 2, 2, 2,
                3, 3,
                3, 3, 3, 3
        };

        int[] testKeys = {
                -1, 0, 1,
                2, 0,
                0, 1, 2, 3,
                3, 1,
                1, 4, 7, 8
        };

        // What the keys should return
        boolean[] testResult = {
                false, false, false,
                false, true,
                true, true, false, false,
                false, true,
                true, true, false, false
        };

        // Sets up the dictionaries
        for(int i = 0; i < testSizes.length; i++) {
            ArrayDictionary testDictionary = new ArrayDictionary(testSizes[i]);
            switch (i) {
                // Set 1
                case 1:
                case 2:
                case 3: break;
                // Set 2
                case 4:
                case 5: testDictionary.add(0, 103);
                        break;
                // Set 3
                case 6:
                case 7:
                case 8:
                case 9:
                // Set 4
                case 10:testDictionary.add(0, 103);
                        testDictionary.add(1, 105);
                        break;
                case 11:testDictionary.add(0, 103);
                        testDictionary.add(1, 105);
                        testDictionary.add(2, 206);
                        break;
                // Set 5
                case 12:
                case 13:
                case 14:
                case 15:testDictionary.add(0, 103);
                        testDictionary.add(1, 105);
                        testDictionary.add(2, 206);
                        testDictionary.add(4, 406);
                        break;
            }
            // Testing the newly created dictionary
            assertEquals(testDictionary.remove(testKeys[i]), testResult[i]);
        }
    }

    @Test
    public void contains() {
        int[] testSizes = {
                0, 0, 0,
                1, 1,
                2, 2, 2, 2,
                3, 3,
                3, 3, 3, 3
        };

        int[] testKeys = {
                -1, 0, 1,
                2, 0,
                0, 1, 2, 3,
                3, 1,
                1, 4, 7, 8
        };

        // What the keys should return
        boolean[] testResult = {
                false, false, false,
                false, true,
                true, true, false, false,
                false, true,
                true, true, false, false
        };

        // Sets up the dictionaries
        for(int i = 0; i < testSizes.length; i++) {
            ArrayDictionary testDictionary = new ArrayDictionary(testSizes[i]);
            switch (i) {
                // Set 1
                case 1:
                case 2:
                case 3:
                    break;
                // Set 2
                case 4:
                case 5:
                    testDictionary.add(0, 103);
                    break;
                // Set 3
                case 6:
                case 7:
                case 8:
                case 9:
                    // Set 4
                case 10:
                    testDictionary.add(0, 103);
                    testDictionary.add(1, 105);
                    break;
                case 11:
                    testDictionary.add(0, 103);
                    testDictionary.add(1, 105);
                    testDictionary.add(2, 206);
                    break;
                // Set 5
                case 12:
                case 13:
                case 14:
                case 15:
                    testDictionary.add(0, 103);
                    testDictionary.add(1, 105);
                    testDictionary.add(2, 206);
                    testDictionary.add(4, 406);
                    break;
            }
            // Testing the newly created dictionary
            assertEquals(testDictionary.contains(testKeys[i]), testResult[i]);
        }
    }
}