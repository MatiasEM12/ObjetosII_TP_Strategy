package ejercicio_2;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    private FormatoFecha tipoFormato;

    public Persona ( String nombre, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void asignarFormatoFecha( FormatoFecha formato){
        this.tipoFormato = formato;
    }

    public String fechaNacimiento (){
        return tipoFormato.formato(fechaNacimiento);
    }

}
