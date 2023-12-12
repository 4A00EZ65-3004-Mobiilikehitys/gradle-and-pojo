package exercise;

import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentManagerDynamicSizeTest {

    private StudentManager manager;

    @Before
    public void setUp() {
        manager = new StudentManager(); // Dynamic resizing
        manager.addStudent(new Student(1, "Alice", "alice@example.com", new LocalDate(2002, 1, 1)));
        manager.addStudent(new Student(2, "Bob", "bob@example.com", new LocalDate(2001, 2, 2)));
    }

    @Test
    public void testAddStudentWithDynamicResizing() {
        // Adding more students than the initial capacity
        manager.addStudent(new Student(3, "Charlie", "charlie@example.com", new LocalDate(2000, 3, 3)));
        manager.addStudent(new Student(4, "David", "david@example.com", new LocalDate(1999, 4, 4)));

        assertNotNull("Student with ID 3 should be added successfully in dynamic resizing mode.", manager.findStudentById(3)); // Charlie should be added
        assertNotNull("Student with ID 4 should be added successfully in dynamic resizing mode.", manager.findStudentById(4)); // David should be added
    }

    @Test
    public void testFindStudentById() {
        assertNotNull("Finding an existing student by ID should return a non-null student object.", manager.findStudentById(1));
        assertNull("Finding a non-existing student ID should return null.", manager.findStudentById(4)); // ID not present
    }
}
