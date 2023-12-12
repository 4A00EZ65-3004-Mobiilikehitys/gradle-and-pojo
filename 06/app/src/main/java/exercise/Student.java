package exercise;

import org.joda.time.LocalDate;

/**
 * Represents a student with basic attributes like ID, name, email,
 * and date of birth.
 * This class ensures that the attributes are valid through its setters.
 */
public final class Student {
    private int studentId;
    private String name;
    private String email;
    private LocalDate dateOfBirth;

    /**
     * Constructs a new Student with the given details.
     *
     * @param studentId The student's ID, which must be positive.
     * @param name The student's name, which cannot be null or empty.
     * @param email The student's email, which cannot be null or empty.
     * @param dateOfBirth The student's date of birth,
     *                      which cannot be in the future.
     */
    public Student(final int studentId, final String name, final String email,
                                                final LocalDate dateOfBirth) {
    }

    // Getters and Setters with Javadoc

    /**
     * Sets the student's ID.
     *
     * @param studentId The student's ID, must be positive.
     * @throws IllegalArgumentException if the ID is not positive.
     */
    public void setStudentId(final int studentId) {

    }

    /**
     * Gets the student's ID.
     *
     * @return The ID of the student.
     */
    public int getStudentId() {
        return -1;
    }

    /**
     * Gets the student's name.
     *
     * @return The name of the student.
     */
    public String getName() {
        return null;
    }

    /**
     * Gets the student's email address.
     *
     * @return The email address of the student.
     */
    public String getEmail() {
        return null;
    }

    /**
     * Gets the student's date of birth.
     *
     * @return The date of birth of the student.
     */
    public LocalDate getDateOfBirth() {
        return null;
    }

    /**
     * Sets the student's name.
     *
     * @param name The student's name, cannot be null or empty.
     * @throws IllegalArgumentException if the name is null or empty.
     */
    public void setName(final String name) {

    }

    /**
     * Sets the student's email.
     *
     * @param email The student's email, cannot be null or empty.
     * @throws IllegalArgumentException if the email is null or empty.
     */
    public void setEmail(final String email) {

    }

    /**
     * Sets the student's date of birth.
     *
     * @param dateOfBirth The student's date of birth, cannot be in the future.
     * @throws IllegalArgumentException if the date of birth is in the future.
     */
    public void setDateOfBirth(final LocalDate dateOfBirth) {

    }

    /**
     * Returns a string representation of the Student object.
     * <p>
     * This method formats the student's details in a structured manner,
     * including student ID, name, email, and date of birth. Useful for
     * debugging and logging purposes.
     * </p>
     * Example output:
     * <pre>
     * Student{
     * studentId=123, name='John Doe', email='john.doe@example.com',
     * dateOfBirth=2000-01-01
     * }
     * </pre>
     *
     * @return A formatted string representing the student's information.
     */
    @Override
    public String toString() {
        return null;
    }
}
