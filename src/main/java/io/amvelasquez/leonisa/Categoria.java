package io.amvelasquez.leonisa;

public class Categoria {

    private String tipoprenda;
    private String talla;
    private String color;
    private String material;

    public Categoria(String tipoprenda, String talla, String color, String material){

        this.tipoprenda = tipoprenda;
        this.talla = talla;
        this.color = color;
        this.material = material;
    }

    public String getTalla() {

        return talla;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {

        return material;
    }

    public String getTipoprenda() {
        return tipoprenda;
    }
}
