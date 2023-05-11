/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class e01_Yate extends e01_BarcoMotor{
    private int numCamarotes;

    public e01_Yate() {
    }

    public e01_Yate(int numCamarotes, int potenciaCV, String matricula, int eslora, int añoFabr) {
        super(potenciaCV, matricula, eslora, añoFabr);
        this.numCamarotes = numCamarotes;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }
    
    
    
    
    
}
