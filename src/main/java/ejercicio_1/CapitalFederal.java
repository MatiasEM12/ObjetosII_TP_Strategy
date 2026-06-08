package ejercicio_1;

public class CapitalFederal implements Destino{

    public static final int COSTO_BASE_COLECTIVOS_SUR = 1000;
    public static final int COSTO_BASE_CORREO_ARGENTINO = 500;

    @Override
    public float costoBaseColectivosSur() {
        return COSTO_BASE_COLECTIVOS_SUR;
    }

    @Override
    public float costoBaseCorreoArgentino(ServicioDistancia servicio) {
        return COSTO_BASE_CORREO_ARGENTINO;
    }
}
