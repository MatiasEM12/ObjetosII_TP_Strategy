package ejercicio_1;

public class GranBuenosAires implements Destino{

    public static final int COSTO_BASE_COLECTIVOS_SUR = 1500;
    public static final int COSTO_BASE_CORREO_ARGENTINO = 800;
    public static final int ADICIONAL_POR_VIAJE = 5;

    @Override
    public float costoBaseColectivosSur() {
        return COSTO_BASE_COLECTIVOS_SUR;
    }

    @Override
    public float costoBaseCorreoArgentino(ServicioDistancia servicio) {
        return COSTO_BASE_CORREO_ARGENTINO + (ADICIONAL_POR_VIAJE * servicio.kilometrosHasta(this));
    }
}
