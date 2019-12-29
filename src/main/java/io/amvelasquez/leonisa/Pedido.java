package io.amvelasquez.leonisa;

import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.Vector;

    public class Pedido {
        private String mediDePago;
        private double descuento;
        private int prontoPago;
        private int cantidadUnidad;

        Vector<Object> pedido = new Vector<Object>();
        Vector<Object> total = new Vector<Object>();

        public Pedido(int cantidadUnidad, String mediDePago, double descuento, int prontoPago,Categoria cat) {

            this.cantidadUnidad = cantidadUnidad;
            this.mediDePago = mediDePago;
            this.descuento = descuento;
            this.prontoPago = prontoPago;
        }

        public Pedido() {
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

        public Object totalCompra(Leonisa leonisa,int cantidadUnidad){

            total.add(cantidadUnidad*leonisa.getPrecio());
            return total;
        }

        public Object totalCompra(Leo leo,int cantidadUnidad){

            total.add(cantidadUnidad*leo.getPrecio());
            return total;
        }

        public Object totalCompra(Teen teen,int cantidadUnidad){

            total.add(cantidadUnidad*teen.getPrecio());
            return total;
        }

    }