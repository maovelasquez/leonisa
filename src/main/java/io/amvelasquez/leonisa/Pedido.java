package io.amvelasquez.leonisa;

import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.Vector;

public class Pedido {

    private int cantidadUnidad;

    Vector<Object> pedido = new Vector<Object>();

    public Pedido() {
    }

    public Pedido(int cantidadUnidad) {

        this.cantidadUnidad = cantidadUnidad;
    }

    public void asignarProducto(Leonisa leonisa) {
        pedido.add(leonisa);
    }

    public void asignarProducto(Leo leo) {
        pedido.add(leo);
    }

    public void asignarProducto(Teen teen) {
        pedido.add(teen);
    }
}