package io.amvelasquez.leonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoriaTest {
    private Categoria ca;

    @Before
    public void setUp() throws Exception {
        ca = new Categoria("bra","32","Blanco","Licra");
    }

    @Test
    public void getTalla() {
        Assert.assertEquals("La talla no es la esperada", "32", ca.getTalla());
    }

    @Test
    public void getColor() {
        Assert.assertEquals("El color no es el esperado", "Blanco", ca.getColor());
    }

    @Test
    public void getMaterial() {
        Assert.assertEquals("El material no es el esperado", "Licra", ca.getMaterial());
    }

    @Test
    public void getTipoprenda() {
        Assert.assertEquals("El tipo de prenda no es el esperado", "bra", ca.getTipoprenda());
    }
}