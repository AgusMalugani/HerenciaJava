/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
Número de mástiles para veleros.
 */
public class e01_Velero extends e01_Barco {
    private int mastiles;

    public e01_Velero() {
    }

    public e01_Velero(int mastiles) {
        this.mastiles = mastiles;
    }

    public e01_Velero(int mastiles, String matricula, int eslora, int añoFabr) {
        super(matricula, eslora, añoFabr);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
    
    
    
    
    
}
