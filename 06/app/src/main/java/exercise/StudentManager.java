package exercise;

/**
 * Manages an array of Student objects.
 * Supports adding students and finding a student by ID.
 * The array is fixed in size.
 */
public class StudentManager {
    /**
     * Array of student objects.
     */
    private Student[] students;

    /**
     * Current number of students in the array.
     */
    private int size;

    /**
     * Maximum size of the student array.
     */
    private final int maxSize;

    /**
     * Constructs a StudentManager with a specified initial array size.
     * This size is the fixed limit for the number of students.
     *
     * @param initialSize The initial size of the student array.
     * @throws IllegalArgumentException if initialSize is less than or
     * equal to 0.
     */
    public StudentManager(final int initialSize) {

    }

    /**
     * Adds a student to the array.
     * If the array is full, it throws an IllegalStateException.
     *
     * @param student The student to be added.
     * @throws IllegalStateException if the student array is full.
     */
    public void addStudent(final Student student) {

    }

    /**
     * Finds a student by their ID.
     *
     * @param id The ID of the student to find.
     * @return The student with the given ID, or null if not found.
     */
    public Student findStudentById(final int id) {
        return null;
    }
}
