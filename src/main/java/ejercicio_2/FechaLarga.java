package ejercicio_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Locale;

public class FechaLarga implements FormatoFecha{
    private static final String FORMATO_LARGO = "dd 'de' MMMM 'de' yyyy";

    @Override
    public String formato(LocalDate fecha) {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern(FORMATO_LARGO, new Locale("es", "AR"));
        return fecha.format(formato);
    }
}
