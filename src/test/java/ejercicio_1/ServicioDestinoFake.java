package ejercicio_1;

public class ServicioDestinoFake implements ServicioDistancia{
    @Override
    public float kilometrosHasta(Destino destino) {
        return 100;
    }
}
