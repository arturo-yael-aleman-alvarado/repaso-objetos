package uaslp.objetos.escuela;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Alumno {

    private String nombre;
    private String clave;
    private String claveDeCarrera;
    private LocalDate fechaNacimiento;
    private int anioDeIngreso;

    public static builder builder(){
        return new builder();
    }

    public Alumno(builder builder) {
        nombre = builder.getNombre();
        this.clave = builder.getClave();
        this.claveDeCarrera = builder.getClaveDeCarrera();
        this.fechaNacimiento = builder.getFechaNacimiento();
        this.anioDeIngreso = builder.getAnioDeIngreso();
    }

    public String getNombre(){
        return nombre;
    }

    public String getClave(){
        return clave;
    }

    public String getClaveDeCarrera(){
        return claveDeCarrera;
    }

    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }

    public int getAnioDeIngreso(){
        return anioDeIngreso;
    }
}
