package uaslp.objetos.escuela;

import java.time.LocalDate;

public class builder {
    private String nombre;
    private String clave;
    private String claveDeCarrera;
    private int anioDeIngreso;
    private LocalDate fechaNacimiento;

    public builder(){}

    public builder nombre(String nombre){
        this.nombre=nombre;
        return this;
    }

    public builder clave(String clave){
        this.clave = clave;
        return this;
    }

    public builder claveDeCarrera(String claveDeCarrera){
        this.claveDeCarrera = claveDeCarrera;
        return this;
    }

    public builder anioDeIngreso(int anioDeIngreso){
        this.anioDeIngreso = anioDeIngreso;
        return this;
    }

    public builder fechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }

    public Alumno build() {
        return new Alumno(this);
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getClaveDeCarrera() {
        return claveDeCarrera;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}
