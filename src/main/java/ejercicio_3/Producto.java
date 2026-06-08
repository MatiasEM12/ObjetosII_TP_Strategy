package ejercicio_3;

public class Producto {

    public double precio;
    private CalculadorDePrecios calculador;

    public Producto(double precio, CalculadorDePrecios calculador) {

        this.precio = precio;
        this.calculador = calculador;
    }
    public double precioFinal() {

        return calculador.precioFinal(precio);
    }

}
