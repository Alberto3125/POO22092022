/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author pablo
 */
public class Foco {
    String color;
    String tipo;
    int tamano;

    public Foco() {
    }

    public Foco(String color, String tipo, int tamano) {
        this.color = color;
        this.tipo = tipo;
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Foco{" + "color=" + color + ", tipo=" + tipo + ", tamano=" + tamano + '}';
    }
    
    
}
