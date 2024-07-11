package edu.ar.model;

public class Director extends Persona{
    private int cantPelisDirigidas;

    public Director(){
        //constructor por defecto
    }
    //se retiro id de parametros porque el id debe ser gestionado por una base de datos
    public Director(String nom, String ap, String nac, int cantDir){
        //id debe ser gestionado por base de datos
        //por lo tanto, debo usar un constructor que no requiera setear id
        //super(id, ap, nom, nac);
        super(ap, nom, nac);
        this.cantPelisDirigidas = cantDir;
    }

    public int getCantPeliculasActuadas(){
        return this.cantPelisDirigidas;
    }

    public void setCantPeliculasActuadas(int cant){
        this.cantPelisDirigidas = cant;
    }

    @Override
    public String toString() {
        return "toString de director heredado de persona: " + super.toString() + ", cantidad de peliculas dirigidas: " + this.cantPelisDirigidas;
    }
}
