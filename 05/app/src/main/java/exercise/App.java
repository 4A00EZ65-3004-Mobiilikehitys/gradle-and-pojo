package exercise;

/**
 * Exercise 05
 *
 * The App class contains the main method to demonstrate the functionalities
 * of the MyString class.
 */
public final class App {

    /**
     * Private constructor to prevent instantiation of utility class.
     */
    private App() {
        // Prevents instantiation
    }

    /**
     * The main method where the MyString class is demonstrated.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(final String[] args) {
        // Create a char array
        char[] data = {'m', 'o', 'i'};

        // Initialize MyString with the char array
        MyString mj = new MyString(data);

        // Print the length of the MyString instance
        System.out.println(mj.length()); // Output: 3

        // Print the character at index 0 of the MyString instance
        System.out.println(mj.charAt(0)); // Output: 'm'

        // Print the result of the equals method when comparing mj to itself
        System.out.println(mj.equals(mj)); // Output: true

        // Print the reversed MyString
        System.out.println(mj.reverse()); // Output: "iom"

        // Create another char array for comparison
        char[] data2 = {'m', 'o'};

        // Check if MyString mj starts with the sequence of characters in data2
        System.out.println(mj.startsWith(new MyString(data2))); // Output: true
    }
}
