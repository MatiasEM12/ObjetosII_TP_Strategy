package ejercicio_3;

public class CalculadorOtro implements CalculadorDePrecios{
    @Override
    public double precioFinal(double precio) {
        var impuestos = 0.15;
        var descuentos = 0.0;

        if (precio > 50) {
            descuentos = 0.05;
        }
        double total = precio * (1 + impuestos) * (1 - descuentos);
        if (precio > 200) {
            total -= 10;
        }
        return total;
    }
}
