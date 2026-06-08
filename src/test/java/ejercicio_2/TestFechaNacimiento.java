package ejercicio_2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFechaNacimiento {

    @Test
    public void formatoCorto(){
        var hoy = LocalDate.now();
        var persona = new Persona("pepe", hoy);
        persona.asignarFormatoFecha(new FechaCorta());

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaEsperada = hoy.format(formato);

        assertEquals(fechaEsperada, persona.fechaNacimiento());
    }

    @Test
    public void formatoLargo(){
        var hoy = LocalDate.now();
        var persona = new Persona("pepe", hoy);
        persona.asignarFormatoFecha(new FechaLarga());

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy", new Locale("es", "AR"));
        String fechaEsperada = hoy.format(formato);

        assertEquals(fechaEsperada, persona.fechaNacimiento());
    }
}
