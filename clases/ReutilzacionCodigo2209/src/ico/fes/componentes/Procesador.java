/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author pablo
 */
public class Procesador {
    String marca;
    float frecuenciaEnGhzn;

    public Procesador() {
    }

    public Procesador(String marca, float frecuenciaEnGhzn) {
        this.marca = marca;
        this.frecuenciaEnGhzn = frecuenciaEnGhzn;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getFrecuenciaEnGhzn() {
        return frecuenciaEnGhzn;
    }

    public void setFrecuenciaEnGhzn(float frecuenciaEnGhzn) {
        this.frecuenciaEnGhzn = frecuenciaEnGhzn;
    }

    @Override
    public String toString() {
        return "Procesador{" + "marca=" + marca + ", frecuenciaEnGhzn=" + frecuenciaEnGhzn + '}';
    }
    
}
