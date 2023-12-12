package exercise;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testGetPointValues() {
        String result = App.getPointValues();
        String expectedResult = "Point{x=0, y=0}";
        assertEquals("Should return the default point values", expectedResult, result);
    }

    @Test
    public void testModifyPoint() {
        Point testPoint = new Point();
        App.modifyPoint(testPoint);
        assertEquals("x should be modified to 5", 5, testPoint.getX());
        assertEquals("y should be modified to 5", 5, testPoint.getY());
    }
}
