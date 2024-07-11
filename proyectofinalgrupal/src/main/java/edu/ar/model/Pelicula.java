package edu.ar.model;

public class Pelicula {
    //atributos de la clase Pelicula
    //id nombre descripcion genero calificacion anio estrellas(byte) director
    private int id;
    private String nombre;
    private String descripcion;
    private String genero;
    private int calificacion;
    private int anio;
    private int estrellas;
    private String director;

    public boolean esEstreno(){
        return anio==2024? true : false;
    }

    //constructor
    public Pelicula(){
        this.id = 0;
        this.nombre = "";
        this.anio = 1600;
    }
    //constructor parametrizado
    public Pelicula(int id, String nombre, String descripcion, String genero, int cal, int anio, int est, String dir){
        this.anio = anio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.genero = genero;
        this.calificacion = cal;
        this.estrellas = est;
        this.director = dir;
        this.id = id;
    }

    public Pelicula(String nombre, String descripcion, String genero, int cal, int anio, int i, String dir){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.genero = genero;
        this.calificacion = cal;
        this.anio = anio;
        this.estrellas = i;
        this.director = dir;
    }
    public int getId() {
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getAnio(){
        return this.anio;
    }

    public String getDescripcion(){
        return this.descripcion;
    }
    public String getGenero(){
        return this.genero;
    }
    public int getCalificacion(){
        return this.calificacion;
    }
    public int getEstrellas(){
        return this.estrellas;
    }
    public String getDirector(){
        return this.director;
    }

    //sobreescribo toString para que no me devuelva el valor alfanumerico de la clase
    @Override
    public String toString(){
        return "Pelicula [id=" + id + ", titulo="+ nombre + ", anio=" + anio +"]";
    }
}
