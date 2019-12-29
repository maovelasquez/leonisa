package io.amvelasquez.leonisa;

import org.junit.Before;

import static org.junit.Assert.*;

public class TeenTest {
    private Teen te;


    @Before
    public void setUp() throws Exception {
        te = new Teen("AFP001", 15000, "Panti", "S", "Blanco", "Algodón");

    }
}