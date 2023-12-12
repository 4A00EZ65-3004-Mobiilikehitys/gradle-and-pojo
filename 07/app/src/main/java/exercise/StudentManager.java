package exercise;

import java.util.Arrays;

/**
 * Manages an array of Student objects.
 * Supports adding students, finding a student by ID.
 * The array can be either fixed in size or dynamically resized.
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
    private int maxSize;

    /**
     * Flag indicating whether the array should resize dynamically.
     */
    private final boolean isDynamic;

    /**
     * Default initial size for the dynamic array.
     */
    private static final int DEFAULT_INITIAL_SIZE = 10;

    /**
     * Constructs a StudentManager with a default initial array size.
     * This constructor allows dynamic resizing of the array.
     */
    public StudentManager() {

    }

    /**
     * Constructs a StudentManager with a specified initial array size.
     * This size is the fixed limit for the number of students.
     *
     * @param initialSize The initial size of the student array.
     */
    public StudentManager(final int initialSize) {

    }

    /**
     * Adds a student to the array.
     * If the array is full, it either resizes the array dynamically or
     * throws an exception.
     *
     * @param student The student to be added.
     * @throws IllegalStateException if student array is full and not dynamic.
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
