package edu.ar.model;

public class Persona {
    private int id;
    private String apellido;
    private String nombre;
    private String nacionalidad;

    public Persona(){

    }

    public Persona(int id, String apellido, String nombre, String nacionalidad){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }

    public Persona(String apellido, String nombre, String nacionalidad){
        this.apellido= apellido;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public int getId(){
        return this.id;
    }

    public String getApellido(){
        return this.apellido;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getNacionalidad(){
        return this.nacionalidad;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setApellido(String ap){
        this.apellido = ap;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }

    public void setNacionalidad(String nac){
        this.nacionalidad = nac;
    }

    @Override
    public String toString(){
        return "Persona: id=" + id + ", nombre="+ this.nombre + ", apellido=" + this.apellido + ", nacionalidad=" + this.nacionalidad;
    }
    
}
