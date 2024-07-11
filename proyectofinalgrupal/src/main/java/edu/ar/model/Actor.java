package edu.ar.model;

public class Actor extends Persona {
    private int cantPeliculasActuadas;
    
    
    public Actor(){
        //constructor por defecto
    }
    public Actor(int id, String nom, String ap, String nac, int cantPeliAct){
        //super usa el constructor parametrizado de persona
        super(id, ap, nom, nac);
        this.cantPeliculasActuadas=cantPeliAct;
    }

    public int getCantPeliculasActuadas(){
        return this.cantPeliculasActuadas;
    }

    public void setCantPeliculasActuadas(int cant){
        this.cantPeliculasActuadas = cant;
    }

    //llamo a tostring de persona con super
    @Override
    public String toString(){
        return "toString heredado de Pers: " + super.toString() + ", cant pelis actuadas: " + getCantPeliculasActuadas();
    }
}
