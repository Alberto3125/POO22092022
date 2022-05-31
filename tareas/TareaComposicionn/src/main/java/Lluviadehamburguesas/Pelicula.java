
package Lluviadehamburguesas;

import pelicula.componentes.Procutora;
import pelicula.componentes.Actor;
import pelicula.componentes.Director;

public class Pelicula {
    
    private String nombre;
    private int lanzamiento;
    private Actor actor;
    private Director director;
    private Procutora procutora;

    public Pelicula() {
    }

    public Pelicula(String nombre, int lanzamiento, Actor actor, Director director, Procutora procutora) {
        this.nombre = nombre;
        this.lanzamiento = lanzamiento;
        this.actor = actor;
        this.director = director;
        this.procutora = procutora;
    }

    public Procutora getProcutora() {
        return procutora;
    }

    public void setProcutora(Procutora procutora) {
        this.procutora = procutora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", lanzamiento=" + lanzamiento + ", actor=" + actor + ", director=" + director + ", procutora=" + procutora + '}';
    }
    
}
