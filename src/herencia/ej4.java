/*
<<<<<<< HEAD
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, 
vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package herencia;

import Entidad.ej4.ej4_Circulo;
import Entidad.ej4.ej4_Rectangulo;

public class ej4 {

  
    public static void main(String[] args) {
        ej4_Circulo circulo = new ej4_Circulo();
        ej4_Rectangulo rectangulo = new ej4_Rectangulo();
        
        circulo.area();
        circulo.perimetro();
        rectangulo.area();
        rectangulo.perimetro();
    }
}

