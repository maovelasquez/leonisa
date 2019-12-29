package io.amvelasquez.leonisa;

import org.junit.Before;

import static org.junit.Assert.*;

public class LeoTest {
    private Leo leo;

    @Before
    public void setup(){
        leo = new Leo("AFBo001", 15000, "Boxer", "S", "Gris", "Algodón");
    }
}