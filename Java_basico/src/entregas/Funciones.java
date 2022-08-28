package entregas;

public class Funciones {

    public static void main(String[] args) {

      double precio = 89.99;

      double precioConIva = calculaPrecioConIva(precio);

      System.out.println("Precio del producto con IVA = " +precioConIva);


    }

    static double calculaPrecioConIva(double precio){

        double precioIva;
        double precioTotal = 0;

        precioIva = precio * 0.21;
        precioTotal = precio + precioIva;

        return precioTotal;

    }
}
