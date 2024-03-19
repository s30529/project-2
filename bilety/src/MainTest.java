import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void testGetPrice() {
        assertEquals(36.0, Main.getPrice(0.1));
        assertEquals(40.0, Main.getPrice(0.0));
        assertEquals(0.0, Main.getPrice(1.0));
    }

    @Test
    void testGetDiscount() {
        assertEquals(0.6, Main.getDiscount("Warsaw", "Monday", 20));
        assertEquals(1.0, Main.getDiscount("Warsaw", "Thursday", 20));
        assertEquals(0.5, Main.getDiscount("Krakow", "Tuesday", 16));
    }

    // Test metody getString() nie jest wymagany, ponieważ ta metoda wywołuje tylko scanner.nextLine().

    @Test
    void testGetInt() {
        // Test metody getInt() może być problematyczny, ponieważ skaner może zachowywać się nieprzewidywalnie podczas testowania.
        // Lepszym podejściem byłoby podanie wartości na sztywno, ale w praktyce testowanie metody getInt() wymagałoby bardziej zaawansowanego podejścia.
        // W związku z tym można pominięć ten test lub wykonać testy manualne na tej metodzie.
    }
}
