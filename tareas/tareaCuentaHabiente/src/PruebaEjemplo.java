
public class PruebaEjemplo {
    
    public static void main(String[] args) {
        System.out.println("---Cuenta Habientes---");
        Cuentahabiente[] lista = new Cuentahabiente[5];
        lista[0]= new Cuentahabiente("98765", "Andres",80000.62f);
        lista[1]= new Cuentahabiente("64749", "Angelica",99999.70f);
        lista[2]= new Cuentahabiente("62259", "Selene",12000.11f);
        lista[3]= new Cuentahabiente("18825", "Hannia",76888.87f);
        lista[4]= new Cuentahabiente("34556", "Rebeca",24560.30f);
        
        for (Cuentahabiente cuentahabiente : lista) {
            System.out.println(cuentahabiente.evaluarNivelCliente());
        }
    }
    
}
