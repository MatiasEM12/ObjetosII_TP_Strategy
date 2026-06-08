package ejercicio_3;

public class CalculadorLibro implements CalculadorDePrecios{


    public static final double DESCUENTOS = 0.1;
    public static final int LIMITE_PRECIO = 100;
    public static final double IMPUESTOS = 0.1;

    @Override
    public double precioFinal(double precio) {
        var impuesto = IMPUESTOS;
        var descuento = DESCUENTOS;
        double total = precio * (1 + impuesto) * (1 - descuento);

        if (precio > LIMITE_PRECIO) {
            total -= 10;
        }

        return total;
    }
}
