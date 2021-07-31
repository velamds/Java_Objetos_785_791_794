package models;

import java.time.LocalDate;
import java.time.Period;

abstract class Persona {
    private String documento;
    private String nombre;
    private LocalDate fechaNacimiento;

    public Persona(){

    }

    public Persona(String documento, String nombre, LocalDate fechaNacimiento){
        this.documento = documento;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }


    //Obtener
    public String getDocumento(){
        return this.documento;
    }
    //Asignar
    public void setDocumento(String documento){
        this.documento = documento;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad(){
        LocalDate fechaHoy = LocalDate.now();
        Period edad = Period.between(this.fechaNacimiento,fechaHoy);
        return edad.getYears();
    }
}
