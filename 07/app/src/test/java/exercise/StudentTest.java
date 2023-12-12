package exercise;

import org.joda.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testValidStudentCreation() {
        Student student = new Student(1, "John Doe", "john@example.com", new LocalDate(2000, 1, 1));
        assertEquals("Student ID does not match the expected value.", 1, student.getStudentId());
        assertEquals("Student name does not match the expected value.", "John Doe", student.getName());
        assertEquals("Student email does not match the expected value.", "john@example.com", student.getEmail());
        assertEquals("Student date of birth does not match the expected value.", new LocalDate(2000, 1, 1), student.getDateOfBirth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStudentIdValidation() {
        new Student(-1, "John Doe", "john@example.com", new LocalDate(2000, 1, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNameValidation() {
        new Student(1, "", "john@example.com", new LocalDate(2000, 1, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmailValidation() {
        new Student(1, "John Doe", "", new LocalDate(2000, 1, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDateOfBirthValidation() {
        new Student(1, "John Doe", "john@example.com", new LocalDate(2025, 1, 1));
    }

    @Test
    public void testToString() {
        Student student = new Student(1, "John Doe", "john@example.com", new LocalDate(2000, 1, 1));
        String expectedString = """
            Student{
            studentId=1, name='John Doe', email='john@example.com', dateOfBirth=2000-01-01
            }""";
        assertEquals("The toString output does not match the expected format.", expectedString, student.toString());
    }
}
