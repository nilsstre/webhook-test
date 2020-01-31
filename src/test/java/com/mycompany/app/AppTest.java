package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void adder() {
        assertEquals(App.adder(1, 1), 2);
        assertNotEquals(App.adder(1, 2), 1);
    }
}
