package models;

import java.time.LocalDate;
import java.time.Period;

public class Empleado extends Persona implements DAO{
    private String cargo;
    private double salario;
    private LocalDate fechaIngreso;

    public Empleado() {
    }

    public Empleado(String documento, String nombre, LocalDate fechaNacimiento, String cargo, double salario, LocalDate fechaIngreso) {
        super(documento, nombre, fechaNacimiento);
        this.cargo = cargo;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int edadIngreso(){
        //fechaIngreso // esta en esta clase
        //fechaNacimiento //esta en persona
        Period edad = Period.between(this.getFechaNacimiento(),this.fechaIngreso);
        return edad.getYears();
    }

    @Override
    public String insertar() {
        return "Empleado: Registro insertado";
    }

    @Override
    public String consultar() {
        return "Empleado: consulta";
    }

    @Override
    public String actualizar() {
        return "Empleado: actualizar";
    }

    @Override
    public String eliminar() {
        return "Empleado: Eliminar";
    }
}
