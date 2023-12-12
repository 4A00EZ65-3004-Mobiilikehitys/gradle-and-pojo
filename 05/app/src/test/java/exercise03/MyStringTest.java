package exercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyStringTest {
    @Test
    public void testDataCloning() {
        char[] originalData = {'a', 'b', 'c'};
        MyString myString = new MyString(originalData);

        // Modify the original array
        originalData[0] = 'x';

        // Test if the MyString object's data is unaffected
        assertEquals("MyString instance should not be affected by changes in the original array",
                     'a', myString.charAt(0));
    }

    @Test
    public void testLength() {
        MyString myString = new MyString(new char[]{'a', 'b', 'c'});
        assertEquals("Length should be 3 for array {'a', 'b', 'c'}",
                     3, myString.length());
    }

    @Test
    public void testCharAt() {
        MyString myString = new MyString(new char[]{'a', 'b', 'c'});
        assertEquals("Character at index 0 should be 'a'",
                     'a', myString.charAt(0));
        assertEquals("Character at index 1 should be 'b'",
                     'b', myString.charAt(1));
        assertEquals("Character at index 2 should be 'c'",
                     'c', myString.charAt(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testCharAtOutOfBounds() {
        MyString myString = new MyString(new char[]{'a', 'b', 'c'});
        myString.charAt(3);
    }

    @Test
    public void testEquals() {
        MyString string1 = new MyString(new char[]{'a', 'b', 'c'});
        MyString string2 = new MyString(new char[]{'a', 'b', 'c'});
        MyString string3 = new MyString(new char[]{'x', 'y', 'z'});

        assertTrue("Two MyString instances with the same characters should be equal",
                   string1.equals(string2));
        assertFalse("Two MyString instances with different characters should not be equal",
                    string1.equals(string3));
    }

    @Test
    public void testReverse() {
        MyString myString = new MyString(new char[]{'a', 'b', 'c'});
        MyString reversed = myString.reverse();

        assertArrayEquals("Reversing {'a', 'b', 'c'} should result in {'c', 'b', 'a'}",
                          new char[]{'c', 'b', 'a'}, toCharArray(reversed));
    }

    @Test
    public void testStartsWith() {
        MyString string = new MyString(new char[]{'a', 'b', 'c'});
        MyString prefix = new MyString(new char[]{'a', 'b'});

        assertTrue("MyString {'a', 'b', 'c'} should start with {'a', 'b'}",
                   string.startsWith(prefix));
        assertFalse("MyString {'a', 'b'} should not start with {'a', 'b', 'c'}",
                    prefix.startsWith(string));
    }

    // Helper method to convert MyString to char array for assertion
    private char[] toCharArray(MyString myString) {
        int length = myString.length();
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[i] = myString.charAt(i);
        }
        return chars;
    }
}
