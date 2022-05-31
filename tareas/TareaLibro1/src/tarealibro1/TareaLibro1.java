
package tarealibro1;

public class TareaLibro1 {
   
    public static void main(String[] args) {
        Libro libro1 = new Libro ();
        libro1.setAutor(" Wayne W. ");
        System.out.println("El autor del libro es: " + libro1.getAutor());
        
        libro1.setTitulo(" Tus zonas erroneas ");
        System.out.println("El titulo del libro es: " + libro1.getTitulo());
        
        libro1.setEdicion( "Quinta Edicion");
        System.out.println("La edición del presente libro es: " + libro1.getEdicion());
        
        libro1.setPaginas("312");
        System.out.println("Numero de paginas: " + libro1.getPaginas());
        
        libro1.setGenero("Autoayuda");
        System.out.println("Genero: " + libro1.getGenero());
        
        libro1.setColor("Verde");
        System.out.println("El color del libro es: " + libro1.getColor());
        
    }
    
}
