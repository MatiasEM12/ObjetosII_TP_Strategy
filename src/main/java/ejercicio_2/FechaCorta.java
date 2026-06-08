package ejercicio_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaCorta implements FormatoFecha{

    public static final String FORMATO_CORTO = "dd-MM-yyyy";

    @Override
    public String formato(LocalDate fecha) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern(FORMATO_CORTO);
        return fecha.format(formato);

    }
}
