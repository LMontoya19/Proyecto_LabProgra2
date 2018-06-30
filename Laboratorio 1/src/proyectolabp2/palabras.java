/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolabp2;

/**
 *
 * @author Inspiron
 */
public class palabras {
    String palabra;
    int repite;

    public palabras(String palabra) {
        this.palabra = palabra;
        this.repite = 0;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getRepite() {
        return repite;
    }

    public void setRepite(int repite) {
        this.repite = repite;
    }

    @Override
    public String toString() {
        return palabra+" : "+repite;
    }
    
    
    
}
