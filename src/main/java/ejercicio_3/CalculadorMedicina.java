package ejercicio_3;

public class CalculadorMedicina implements CalculadorDePrecios{
    @Override
    public double precioFinal(double precio) {

        var impuestos = 0.0;
        var descuentos = 0.0;
        if (precio > 50) {
            descuentos = 0.1;
        }

        double total = precio * (1 + impuestos) * (1 - descuentos);
        if (precio > 100) {
            total -= 10;
        }

        return total;
    }
}
