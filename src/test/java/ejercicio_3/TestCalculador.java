package ejercicio_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculador {

    @Test
    public void CalculadorLibro(){
        var p1 = new Producto( 30, new CalculadorLibro());
        assertEquals(29.7,p1.precioFinal());
    }

    @Test
    public void CalculadorMedicina(){
        var p2 = new Producto( 330, new CalculadorMedicina());
        assertEquals(287.0,p2.precioFinal());
    }

    @Test
    public void CalculadorAlimento(){
        var p3 = new Producto( 130, new CalculadorAlimento());
        assertEquals(116.02499999999999,p3.precioFinal());
    }

    @Test
    public void CalculadorOtro(){
        var p4 = new Producto( 130, new CalculadorOtro());
        assertEquals(142.025,p4.precioFinal());
    }
}
