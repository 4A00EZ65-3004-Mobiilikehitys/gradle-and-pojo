package exercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class PointTest {

    @Test
    public void testConstructorWithPositiveCoordinates() {
        Point point = new Point(1, 1);
        assertEquals("x should be 1", 1, point.getX());
        assertEquals("y should be 1", 1, point.getY());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNegativeXCoordinate() {
        new Point(-1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNegativeYCoordinate() {
        new Point(1, -1);
    }

    @Test
    public void testDefaultConstructor() {
        Point point = new Point();
        assertEquals("Default x should be 0", 0, point.getX());
        assertEquals("Default y should be 0", 0, point.getY());
    }

    @Test
    public void testSetXWithPositiveValue() {
        Point point = new Point();
        point.setX(10);
        assertEquals("x should be set to 10", 10, point.getX());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetXWithNegativeValue() {
        Point point = new Point();
        point.setX(-10);
    }

    @Test
    public void testSetYWithPositiveValue() {
        Point point = new Point();
        point.setY(20);
        assertEquals("y should be set to 20", 20, point.getY());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetYWithNegativeValue() {
        Point point = new Point();
        point.setY(-20);
    }

    @Test
    public void testToString() {
        Point point = new Point(3, 4);
        String expected = "Point{x=3, y=4}";
        assertEquals("toString should return correct format", expected, point.toString());
    }

    @Test
    public void testEqualsWithSameObject() {
        Point point = new Point(5, 6);
        assertTrue("Same object should be equal", point.equals(point));
    }

    @Test
    public void testEqualsWithDifferentObjectSameValues() {
        Point point1 = new Point(7, 8);
        Point Point = new Point(7, 8);
        assertTrue("Objects with same values should be equal", point1.equals(Point));
    }

    @Test
    public void testEqualsWithDifferentObjectDifferentValues() {
        Point point1 = new Point(9, 10);
        Point Point = new Point(11, 12);
        assertFalse("Objects with different values should not be equal", point1.equals(Point));
    }

    @Test
    public void testEqualsWithNull() {
        Point point = new Point(13, 14);
        assertFalse("Point should not be equal to null", point.equals(null));
    }
}
