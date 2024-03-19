import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest3 {

    @Test
    void getPrice() {
        assertEquals(20.0, Main.getPrice(0.5)); // Test zniżki 50%
        assertEquals(40.0, Main.getPrice(0.0)); // Brak zniżki
        assertEquals(0.0, Main.getPrice(1.0)); // Pełna zniżka
    }

    @Test
    void getDiscount() {
        assertEquals(0.1, Main.getDiscount("Warsaw", "Monday", 20)); // Test zniżki w Warszawie w poniedziałek dla osoby powyżej 18 roku życia
        assertEquals(1.0, Main.getDiscount("Warsaw", "Thursday", 20)); // Pełna zniżka w Warszawie w czwartek
        assertEquals(0.0, Main.getDiscount("Krakow", "Tuesday", 16)); // Brak zniżki w Krakowie we wtorek dla osoby poniżej 18 roku życia
    }
}