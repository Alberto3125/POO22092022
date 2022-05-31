
package tareacomposicion;

import LDDM.libro;
import libro.componentes.Autor;
import libro.componentes.Editorial;

import Lluviadehamburguesas.Pelicula;
import pelicula.componentes.Actor;
import pelicula.componentes.Director;
import pelicula.componentes.Procutora;

public class Tareacomposicion {

   
    public static void main(String[] args) {
    
        Pelicula miPeli= new Pelicula();
        miPeli.setNombre("Lluvia de hamburguesas");
        miPeli.setLanzamiento(2009);
        miPeli.setActor(new Actor("Erick Elias", 41));
        miPeli.setDirector(new Director("Phill lord"," Estados Unidos "));
        miPeli.setProcutora(new Procutora("SonyOicturesAnimation","Estados Unidos"));
        System.out.println( miPeli );
        
        System.out.println("Metodos Pelicula");
        miPeli.getActor().habla("Yo tampoco pude decir, la FLDSMTFR");
        miPeli.getDirector().organiza(10);
        miPeli.getProcutora().filma(90);
        System.out.println("------------------------------------");
        
        
        libro miLibro= new libro();
        miLibro.setNombre("La vida despues de la muerte");
        miLibro.setPaginas(250);
        miLibro.setAutor(new Autor("ELIZABETH CLARE PROPHET", "Mexico"));
        miLibro.setEditorial(new Editorial("MORYA EDICIONES", "Mexico"));
        System.out.println( miLibro );
        
        System.out.println("Metodos Libro");
        miLibro.getAutor().escribir(500);
        miLibro.getEditorial().imprimir(1000);
        System.out.println("---------------------------------");
     
    }
    
  
}
