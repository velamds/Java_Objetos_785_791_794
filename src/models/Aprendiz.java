package models;

import java.time.LocalDate;

public class Aprendiz extends Persona implements DAO{
    //una clase(objeto) tiene atributos
    public String programa;
    public int ficha;
    protected String correo;

    public Aprendiz(){

    }

    public Aprendiz(String paramDocumento, String paramNombre, LocalDate paramFechaNacimiento, String paramPrograma, int paramFicha, String paramCorreo ){ // Un metodo recibe parametros
        super(paramDocumento, paramNombre, paramFechaNacimiento);
        this.programa = paramPrograma;
        this.ficha  = paramFicha;
        this.correo = paramCorreo;
    }

    public String getCorreo(){
        return this.correo;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    @Override
    public String insertar() {
        return "Aprendiz: insertar";
    }

    @Override
    public String consultar() {
        return "Aprendiz: consultar";
    }

    @Override
    public String actualizar() {
        return "Aprendiz: actualizar";
    }

    @Override
    public String eliminar() {
        return "Aprendiz: eliminar";
    }
}
