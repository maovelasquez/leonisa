package io.amvelasquez.leonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
import java.util.Vector;

public class PedidoTest {

    Vector<Object> pedido;
    private Pedido pedidoLeonisa;
    private Pedido pedidoLeo;
    private Pedido pedidoTeen;
    private Pedido p;

    private Leonisa leonisa;
    private Leo leo;
    private Teen teen;


    @Before
    public void setUp() throws Exception {
        pedido = new Vector<Object>();
        pedidoLeonisa = new Pedido (5,"Efectivo",0,0);
        pedidoLeo = new Pedido(8);
        pedidoTeen = new Pedido(1);
        Pedido p = new Pedido();

        leonisa = new Leonisa("01", 25000, "medias", "m", "Negro", "Algodón");
        leo = new Leo("01", 25000, "medias", "m", "Negro", "Algodón");
        teen = new Teen("01", 25000, "medias", "m", "Negro", "Algodón");

        pedido.add(leonisa);
        pedido.add(leo);
        pedido.add(teen);

    }

    @Test
    public void asignarProducto() {
        boolean asignadoLeonisa = pedido.contains(leonisa);
        Assert.assertTrue("No se ha asignado un producto 'Leonisa' al pedido", asignadoLeonisa);
    }

    @Test
    public void testAsignarProducto() {
        boolean asignadoLeo = pedido.contains(leo);
        Assert.assertTrue("No se ha asignado un producto 'Leo' al pedido", asignadoLeo);
    }

    @Test
    public void testAsignarProducto1() {
        boolean asignadoTeen = pedido.contains(teen);
        Assert.assertTrue("No se ha asignado un producto 'Teen' al pedido", asignadoTeen);
    }

    @Test
    public void totalCompraTestLeonisa() {
        Assert.assertEquals("El total de la compra no es el esperado", 70000, pedidoLeonisa.totalCompra(leonisa.getPrecio()), 0);

    }

    @Test
    public void testTotalCompraTestLeo() {
        Assert.assertEquals("El total de la compra no es el esperado", 45000, pedidoLeo.totalCompra(leo.getPrecio()), 0);
    }

    @Test
    public void testTotalCompraTestTeen() {
        Assert.assertEquals("El total de la compra no es el esperado", 50000, pedidoTeen.totalCompra(teen.getPrecio()), 0);

    }
}


