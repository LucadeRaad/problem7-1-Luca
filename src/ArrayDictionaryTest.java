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

        ArrayDictionary[] dictArray = new ArrayDictionary[testSizes.length];

        // Sets up the dictionaries
        for(int i = 0; i < testSizes.length; i++) {
            System.out.println(i);
            dictArray[i] = new ArrayDictionary(testSizes[i]);
            switch (i) {
                // Set 1
                case 1:
                case 2:
                case 3: break;
                // Set 2
                case 4:
                case 5: dictArray[i].add(0, 103);
                        break;
                // Set 3
                case 6:
                case 7:
                case 8:
                case 9:
                // Set 4
                case 10:dictArray[i].add(0, 103);
                        dictArray[i].add(1, 105);
                        break;
                case 11:dictArray[i].add(0, 103);
                        dictArray[i].add(1, 105);
                        dictArray[i].add(2, 206);
                        break;
                // Set 5
                case 12:
                case 13:
                case 14:
                case 15:dictArray[i].add(0, 103);
                        dictArray[i].add(1, 105);
                        dictArray[i].add(2, 206);
                        dictArray[i].add(4, 406);
                        break;
            }
            System.out.println(dictArray[i].toString() + " Attempted to delete " + testKeys[i]);
            // Testing the newly created dictionary
            assertEquals(dictArray[i].remove(testKeys[i]), testResult[i]);
        }
    }

    @Test
    public void contains() {
        // homework
        assertTrue(false);  // place holder
    }
}