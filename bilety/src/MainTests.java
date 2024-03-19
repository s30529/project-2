import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTests {
    private final InputStream originalSystemIn = System.in;
    private ByteArrayInputStream testIn;

    @BeforeEach
    void setUp() {
        testIn = null;
    }

    @AfterEach
    void tearDown() {
        if (testIn != null) {
            System.setIn(originalSystemIn);
        }
    }

    @Test
    void mainTest() {
        // Prepare test input
        String input = "Warsaw\nMonday\n15\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        // Redirect output for testing
        Main.main(new String[0]);
    }

    @Test
    void displayTest() {
        // Since display method is void, it's difficult to assert its behavior directly
        // We can test this indirectly by calling it within other tests
        // For a more thorough testing, consider refactoring display method to return a String
    }

    @Test
    void getPriceTest() {
        assertEquals(30.0, Main.getPrice(0.25)); // Price with 25% discount
        assertEquals(40.0, Main.getPrice(0.0)); // No discount
        assertEquals(0.0, Main.getPrice(1.0)); // 100% discount
    }

    @Test
    void getDiscountTest() {
        assertEquals(0.0, Main.getDiscount("Gdynia", "Monday", 20)); // No discount
        assertEquals(0.5, Main.getDiscount("Gdynia", "Tuesday", 15)); // Age discount
        assertEquals(0.1, Main.getDiscount("Warsaw", "Friday", 25)); // Location discount
        assertEquals(1.0, Main.getDiscount("Krakow", "Thursday", 5)); // Thursday discount
    }

    @Test
     void getStringTest() {
        // Prepare test input
        String input = "Test input\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        assertEquals("Test input", Main.getString("Test"));
    }


    @Test
     void getIntTest() {
        String input = "25\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        assertEquals(25, Main.getInt("Test"));
    }
}
