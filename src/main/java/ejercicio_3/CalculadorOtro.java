package ejercicio_3;

public class CalculadorOtro implements CalculadorDePrecios{

    public static final double DESCUENTOS = 0.0;
    public static final int LIMITE_PRECIO_INFERIOR = 50;
    public static final int LIMITE_PRECIO_MAYOR = 200;
    public static final double IMPUESTOS = 0.15;

    @Override
    public double precioFinal(double precio) {
        var impuestos = IMPUESTOS;
        var descuentos = DESCUENTOS;

        if (precio > LIMITE_PRECIO_INFERIOR) {
            descuentos = 0.05;
        }
        double total = precio * (1 + impuestos) * (1 - descuentos);
        if (precio > LIMITE_PRECIO_MAYOR) {
            total -= 10;
        }
        return total;
    }
}
