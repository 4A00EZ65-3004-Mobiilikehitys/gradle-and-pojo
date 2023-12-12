package exercise;

import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentManagerFixedSizeTest {

    private StudentManager manager;

    @Before
    public void setUp() {
        manager = new StudentManager(2); // Fixed size
        manager.addStudent(new Student(1, "Alice", "alice@example.com", new LocalDate(2002, 1, 1)));
        manager.addStudent(new Student(2, "Bob", "bob@example.com", new LocalDate(2001, 2, 2)));
    }

    @Test
    public void testFindStudentById() {
        assertNotNull("Finding a student by ID should return a non-null student object.", manager.findStudentById(1));
        assertNull("Finding a non-existing student ID should return null.", manager.findStudentById(4)); // ID not present
    }

    @Test(expected = IllegalStateException.class)
    public void testAddStudentBeyondCapacity() {
        // Attempting to add a third student which should throw an exception
        manager.addStudent(new Student(3, "Charlie", "charlie@example.com", new LocalDate(2000, 3, 3)));
    }
}
