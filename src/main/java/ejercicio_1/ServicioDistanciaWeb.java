package ejercicio_1;

public class ServicioDistanciaWeb implements ServicioDistancia{
    @Override
    public float kilometrosHasta(Destino destino) {
        // Acá iría la llamada al servicio:http://distancia.ar?origen=capital&destino=xxx

        throw new RuntimeException("Servicio web no implementado");
    }

}
