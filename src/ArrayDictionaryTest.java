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
        };

        ArrayDictionary[] dictArray = new ArrayDictionary[testSizes.length];

        for(int i = 0; i < testSizes.length; i++) {
            dictArray[i] = new ArrayDictionary(testSizes[i]);
        }

//        ArrayDictionary dict = new ArrayDictionary();
//        assertTrue(dict.add(2, 82));
//        assertTrue(dict.add(4, 84));
//        assertTrue(dict.add(7, 87));
//        System.out.println(dict);
//        dict.remove(7);
//        System.out.println(dict);
        assertTrue(false);  // place holder
    }

    @Test
    public void contains() {
        // homework
        assertTrue(false);  // place holder
    }
}