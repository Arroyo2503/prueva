package practica.objeto;

public class Coche {

    String marca;
    String modelo;
    String color;


    public Coche(String marca, String modelo, String color ) {

        this.marca = marca;
        this.modelo = modelo;
        this.color = color;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarDetalle() {

        System.out.println("los detalles del coche son: Marca " + getMarca()+ " ,modelo " + getModelo() + " ,color " +getColor()  );

    }

}
