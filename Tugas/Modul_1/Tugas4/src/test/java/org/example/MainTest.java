package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void Skenario1() {
        assertEquals(2, Main.findMin(1, 2, 3));
    }

    @Test
    void Skenario2() {
        assertEquals(-3, Main.findMin(-1, -2, -3));
    }

    @Test
    void Skenario3() {
        assertEquals(0, Main.findMin(0, 0, 1));
    }
}
