package io.amvelasquez.leonisa;

import org.junit.Before;

import static org.junit.Assert.*;

public class LeonisaTest {
    private Leonisa le;

    @Before
    public void setUp() throws Exception {
        le = new Leonisa("AFB002", 25000, "Bra", "34C", "Rosado", "Algodón");

    }
}