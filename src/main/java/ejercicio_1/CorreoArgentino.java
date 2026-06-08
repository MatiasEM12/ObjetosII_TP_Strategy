package ejercicio_1;

import java.lang.classfile.instruction.ReturnInstruction;

public class CorreoArgentino implements TipoEnvio{

    private ServicioDistancia servicioDistancia;

    public CorreoArgentino (ServicioDistancia servicioDistancia){
        this.servicioDistancia = servicioDistancia;
    }
    @Override
    public float calcularCosto(Destino destino, float pesoTotal) {

        float costo = destino.costoBaseCorreoArgentino(servicioDistancia);

        return costo;
    }
}
