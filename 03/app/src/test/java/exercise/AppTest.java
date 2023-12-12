package exercise;

import org.joda.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testGreeting() {
        assertEquals("Method does not return greeting", "greeting", App.greeting());
    }
}
