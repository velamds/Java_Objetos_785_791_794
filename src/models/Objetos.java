package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Objetos {

    public static void main(String[] args){
        Aprendiz objAprendiz = new Aprendiz();
        objAprendiz.setNombre("Adrian");
        objAprendiz.setDocumento("1019123456");
        //objAprendiz.setFechaNacimiento(LocalDate.parse("01/01/1980", DateTimeFormatter.ofPattern("d/MM/yyyy")));
        objAprendiz.setFechaNacimiento(LocalDate.parse("1980-01-01"));
        objAprendiz.ficha = 123;
        objAprendiz.correo = "micorreo@correo.com";
        objAprendiz.programa = "Redes";

        Aprendiz otroObjAprendiz = new Aprendiz("1019", "Angie",LocalDate.now(),"ADSI",1234,"otrocorreo@correo.com" );

        Empleado objEmpleado = new Empleado("101902","Nicolas",LocalDate.parse("1997-02-16"),"Programador",1000,LocalDate.parse("2020-01-01"));

        //System.out.println(objAprendiz.getFechaNacimiento());
        //System.out.println(otroObjAprendiz.getNombre());

        //Persona objPersona = new Persona();

//        System.out.println(objAprendiz.calcularEdad());
//        System.out.println(objEmpleado.calcularEdad());
//        System.out.println(objEmpleado.edadIngreso());

        System.out.println(objAprendiz.insertar());
        System.out.println(objEmpleado.insertar());

    }

}
