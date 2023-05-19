/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.ej4;

/*dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 /
Perímetro circulo: PI * diámetro.

Área rectángulo: base * altura /
Perímetro rectángulo: (base + altura) * 2.
 */
public interface ej4_calculosFormas {
    
    /*
    en la interface tendremos metodos creados pero vacios, sin cuerpo. y en la clase que le implementamos 
    la interface vamos a sobreescribir esos metodos y darle una funcionalidad.

    */
    
   public double PI = 3.14; //cuando creo una variable en una interface, esa variable es PUBLIC Y FINAL por lo tanto seria una constante.
   
   public double area();
   public double perimetro();
   
   
   
    
}
