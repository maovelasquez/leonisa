package io.amvelasquez.leonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductoTest {
    private Producto pro;

    @Before
    public void setUp() throws Exception {
        pro = new Producto("7896",25000,"boxer", "M", "Azul", "Licra");
    }

    @Test
    public void getCiu() {
        Assert.assertEquals("El código no es el esperado", "7896", pro.getCiu());
    }

    @Test
    public void getPrecio() {
        Assert.assertEquals("El precio no es el esperado", 25000, pro.getPrecio(), 0);
    }

    @Test
    public void setPrecioTest() {
        pro.setPrecio(25000);
        Assert.assertEquals("El precio no es el enviado", 25000, pro.getPrecio(), 0);
    }
}