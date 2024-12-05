package practica.objeto;

public class principal {

    public static void main(String[] args) {


        Coche coche1 = new Coche("ford", "focus", "negro");
        Coche coche2 = new Coche("ford", "C-max", "gris");


        coche1.mostrarDetalle();

        coche2.mostrarDetalle();

        coche2.setColor("verde");

        System.out.println("\nDetalles del coche actualizado;");
        coche2.mostrarDetalle();

    }




}
