/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico22090;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class Javabasico22090 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application
        int edad = 20;
        System.out.println("Edad = " + edad);
        Integer edad2 = new Integer (22);
        System.out.println(edad2);
        double x = edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue());
        System.out.println(".-.--..-.-.-.-.-.-.-.-.-.-.-.");
        //Convertit String a entero.
        String cadena = "99";
        int altura = Integer.parseInt(cadena);//Metodo miembro o metodo clase
        Color  c1 = Color.BLUE; //Atributo miembro o atributo de clase
        
        altura +=1;
        System.out.println("Altura = "+ altura );
        
        float y= Float.parseFloat(cadena);
        y=y + 0.5f;
        System.out.println("Altura = "+ y );
        System.out.println(".-.-.-.-.-.-.-.-.-.--.-.--.-.");
        
        Arbol tree1 = new Arbol(2.4f, 15);
        Arbol tree2 = new Arbol(2.4f, 15);
        Arbol tree3 = new Arbol(2.4f, 15);
        Arbol tree4 = new Arbol(2.4f, 15);
        
        System.out.println( tree1 );
        
        System.out.println("Troncos de un arbol = " + Arbol.tronco);
        System.out.println("Troncos de un arbol = " + tree1.tronco);
        System.out.println("Troncos de un arbol = " + tree2.tronco);
        System.out.println("Troncos de un arbol = " + tree3.tronco);
        
        /*
        JOptionPane.showMessageDialog(null, "Hola mundo", "Aqui va el titulo", JOptionPane.ERROR_MESSAGE);
        String dato = JOptionPane.showInputDialog(null, "Dame tu edad", "Introducir datos", JOptionPane.QUESTION_MESSAGE);
        System.out.println(dato);
        */

        //Se hara un codigo sin operador ternario 
        int edad3 = 20; 
        //Validar si es mayor de edad 
        String resultado = "";
        if(edad3<18){
            resultado = "Menor de edad";
        }else{
            resultado = "Mayor de edad, ten un tequila para la garganta";
        }
        System.out.println(resultado);
        //Se hara el mismo algoritmo pero con operador ternario 
        //<cond>? : <True> : <False>;
        
        int edad4=24;
        String res = "";
        res=edad4<18?"Menor de edad 4" : "Mayor de edad, tequila";
        System.out.println(res );
        
        //Cuando tengan una logica asi pueden usar ternario 
        // es muy elegante y ahorra lineas de codigo
        
        // Por ultimo la version minima
        int edad5 = 19;
        System.out.println(edad5 < 18?"Menor de edad 5":"Ya! el tequila");
        
        int val1 =1;
        int val2 =2;
        // haremos una comparacion a nivel bits es decir
        /*
        val1 = 0000....0001;
        val2 = 0000....0010;
        Las dos lineas de arriba es la representacion a nivel bits
        
        1 or 1 = 1
        1 or 0 = 1
        0 or 0 = 0
        
        1 and 0 = 0 
        1 and 1 = 1
        0 and 1 = 0
        
        se usa el simbolo pipe (pleca)
        */
        System.out.println(val1 & val2 );
        /*
        Que esta pasando' esto:
        val1 = 0000....0001;
        or
        val2 = 0000....0010;
        -----------------------
               0000....0011 => 3
        */
        int val3 = 1; //0000...0001
        //int val4 = <<val3;
        //System.out.println(val3<<=);
        int val4 = 0;
        val4 = val3 <<2;
        System.out.println(val4);
        
        System.out.println("-----ARREGLOS-----");
        int []edades; //Primero se declara que sera un arreglo
        // en este punto aun no se reserva memoria 
        // el segundo paso es reservarlo, de un 
        edades = new int [5];
        System.out.println(edades);
        //ahora lo usamos como siempre lo han hecho 
        edades [0] = 10;
        System.out.println("La primer edad es:" + edades [0]);
        
        //declarar e inicializar en una sola linea 
        int [] estaturas = new int [5];
        //ahora.. al igual que en C y C++, puedes asignar valorres
        int [] pesos = {86,99,56,76,77};// en kilo
        // este ultimo veremos su contenido 
        System.out.println(pesos[0]);//86
        System.out.println(pesos[1]);//99
        System.out.println(pesos[2]);//56
        System.out.println(pesos[3]);//76
        System.out.println(pesos[4]);//77
        //Imprimima lo mismo pero con menos lineas de codigo 
        System.out.println("----CON FOR----");
        for (int i = 0; i < pesos.length; i++) {
            System.out.println( pesos[i]);
        }
        
        System.out.println("Orden inverso");
        for(int i=pesos.length-1;i>0; i--){
            System.out.println(pesos[i]);
            
        }
        /*
        En desarrollos de la vida real, programar con arregloes es muy comun,
        porque por ejemplo var a recuperar datos desde una 
        base de datos ...por ejemplo una tabla de alumnos...
        Al ser varios alumnos en la BD... de lado de Java debes tener una forma
        almacenarlos.
        y ahi es donde entran los arreglos
        
        */
        
        System.out.println("Arreglo de alumnos ");
        Alumno [] Lista = new Alumno[5];// 5 alumnos
        Lista[0] = new Alumno("99999", 2, 9.0f);
        Lista[1] = new Alumno("77777", 2, 7.0f);
        Lista[2] = new Alumno("55555", 2, 7.0f);
        Lista[3] = new Alumno("88888", 2, 8.0f);
        Lista[4] = new Alumno("66666", 2, 6.0f);
        
        for (int i = 0; i < Lista.length; i++) {
            Alumno alumno = Lista[i];
            System.out.println( alumno.evaluarDesempeño());
            
        }
        /*
        For each es un FOR especial, introducido
        en la version 2 de java, esa version fue la que 
        sufrio cambios muy grandes en java
        EL FOR EACH fue introducido para simplificae los 
        For con arreglos.
        Hacer fore+TAB
        
        */
        System.out.println("Con for each ...");
        for (Alumno alumno : Lista) {
            System.out.println(alumno.evaluarDesempeño());
             
        }
        
        ArrayList<Alumno> grupo2209= new ArrayList<Alumno>();
        grupo2209.add(new Alumno("99999", 2, 9.0f));
        grupo2209.add(new Alumno("88888", 2, 8.0f));
        grupo2209.add(new Alumno("77777", 2, 7.0f));
        grupo2209.add(new Alumno("66666", 2, 6.0f));
        grupo2209.add(new Alumno("55555", 2, 5.0f));
        
        for (Alumno alumno : grupo2209) {
            System.out.println( alumno );
        }
        
        System.out.println("Add con indice ");
        grupo2209.add(2, new Alumno("81111", 3, 9.9f)); 
        
        for (Alumno alumno : grupo2209) {
            System.out.println( alumno );
        }
        
        Alumno tmp = grupo2209.get(3); // NC = 88888
        System.out.println("Alumno en index = 1 " + tmp);
        
        System.out.println("Eliminar el index 3");
        Alumno tmp2 = grupo2209.remove( 3 );
        System.out.println(" Elemento sacado = " + tmp2);
        
        for (Alumno alumno : grupo2209) {
            System.out.println( alumno );
            
        }
        System.out.println("Reemplazar el i-esimo elemento");
        Alumno tmp3 = grupo2209.set(0, new Alumno("44444", 4, 4.0f));
        System.out.println("El sacado es = " + tmp3);
        
        for (Alumno alumno : grupo2209) {
            System.out.println( alumno);
            
        }
        // Excepciones 
        try {
            System.out.println("Excepciones");
            System.out.println( grupo2209.get(20));
        } catch (Exception e) {
            System.out.println("Error...revisa los indices");
        }
        System.out.println("Fin del programa ");
    }
    
}
