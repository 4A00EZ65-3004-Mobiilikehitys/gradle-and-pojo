package exercise;

/**
 * Represents a string of characters. This class provides custom string
 * manipulation and comparison functionalities.
 */
public class MyString {

    /**
     * The array of characters representing the string.
     */
    private final char[] data;

    /**
     * Constructs a new MyString instance with the specified character array.
     * The input array is cloned to maintain data integrity.
     *
     * @param data The character array to initialize the string.
     */
    public MyString(final char[] data) {

    }

    /**
     * Returns the length of this string.
     *
     * @return The number of characters in this string.
     */
    public int length() {
        return -1;
    }

    /**
     * Returns the character at the specified index. The string is zero-indexed.
     *
     * @param index The index of the character to return.
     * @return The character at the specified index.
     * @throws IndexOutOfBoundsException If index is out of range.
     */
    public char charAt(final int index) {
        return -1;
    }

    /**
     * Compares this string to the specified MyString object.
     *
     * @param obj The MyString object to compare this string against.
     * @return true if the given MyString object represents the same
     *         sequence of characters as this string, false otherwise.
     */
    public boolean equals(final MyString obj) {
        return true;
    }

    /**
     * Returns a new MyString object with this string in reverse order.
     *
     * @return A new MyString object with characters reversed.
     */
    public MyString reverse() {
        return null;
    }

    /**
     * Checks if this string starts with the specified prefix.
     *
     * @param prefix The MyString object representing the prefix.
     * @return true if this string starts with the prefix, false otherwise.
     */
    public boolean startsWith(final MyString prefix) {
        return true;
    }

    /**
     * Returns a string representation of the MyString object.
     *
     * @return A string consisting of the characters in this MyString.
     */
    @Override
    public String toString() {
        return null;
    }
}


