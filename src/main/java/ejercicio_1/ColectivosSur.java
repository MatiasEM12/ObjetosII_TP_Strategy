package ejercicio_1;

public class ColectivosSur implements TipoEnvio {

    public static final int PESO_MAXIMO = 30;
    public static final int PESO_MINIMO = 5;
    public static final int ADICIONAL_PESO_MAXIMO = 2000;
    public static final int ADICIONAL_PESO_MINIMO = 500;

    @Override
    public float calcularCosto(Destino destino, float pesoTotal) {

        float costo = destino.costoBaseColectivosSur();

        if (pesoTotal > PESO_MAXIMO) {
            costo += ADICIONAL_PESO_MAXIMO;
        } else if (pesoTotal > PESO_MINIMO) {
            costo += ADICIONAL_PESO_MINIMO;
        }

        return costo;
    }
}
