/*
 Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.

Los métodos a implementar son:
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.

• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.



• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.

Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:

hay mas metodos

 */
package Entidad;

import java.util.Scanner;

public class ej2_Electrodomestico {
   //precio, color, consumo energético (letras entre A y F) y peso. 
    
    protected int precio;
    protected String color;
    protected char consumoEnergetico; // de A a la F
    protected int peso;
    protected Scanner leer = new Scanner (System.in);

    public ej2_Electrodomestico() {
    }

    public ej2_Electrodomestico(int precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    
 

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    /*
    • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.

    */
    public char comprobarConsumoEnergetico(char letra){
        
        // pedimos en el main una letra, para mandarle por parametro
        if(letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F'){
            this.consumoEnergetico = letra;  // le asigno letra a la variable
        } else {  // si la letra no es ninguna de la A a la F, entonces por defecto va a ir F
            this.consumoEnergetico = 'F';
        }
       return this.consumoEnergetico; 
    }
    
    /*
    • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
    */
    public String comprobarColor(String color){  // a la variable le vamos a poner toLowerCase para que sea todo minuscula
        
        switch (color){
            case "blanco":
                this.color = color;
                break;
            case "negro":
                this.color = color;
                break;
            case "rojo":
                this.color = color;
                break;
            case "azul":
                this.color = color;
                break;
            case "gris":
                this.color=color;
            break;
            
            default:
                // x si noes ninguno, entonces es blanco
                this.color = "blanco";
                break;
        }
        return this.color;
        
    }
    
    /*
    • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.

    */
  public ej2_Electrodomestico crearElectrodomestico(){
     // precio base es de 1000 $
     
      System.out.println("Ingrese cuanto pesa en kg");
      peso = leer.nextInt(); // set
      System.out.println("Ingrese el color");
      comprobarColor(leer.next().toLowerCase());
      System.out.println("Ingrese su consumo electrico");
      comprobarConsumoEnergetico(leer.next().toUpperCase().charAt(0));
      
      precio = precioFinal( peso, consumoEnergetico);
      

      return new ej2_Electrodomestico(precio, color, consumoEnergetico, peso);
      
  }
  
  /*
  Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
  
  */
  public int precioFinal(int peso, char consumoEnergetico){
      
      
      if(consumoEnergetico == 'A'){
          precio = 1000;
      } else if(consumoEnergetico == 'B'){
          precio = 800;
      } else if(consumoEnergetico == 'C'){
          precio= 600;
      } else if(consumoEnergetico == 'D'){
          precio = 500;
      } else if(consumoEnergetico == 'E'){
          precio = 300 ;
      } else {
          precio = 100;
      }
   
      if(peso>= 1 && peso <= 19){
          precio = getPrecio() +100;
      } else if(peso>= 20 && peso <= 49){
          precio = getPrecio() + 500;
      } else if(peso>= 50 && peso <= 79){
          precio = getPrecio() +800;
      } else if(peso>= 80){
          precio = getPrecio() +1000;
      }
 
      return this.precio;

  }
  

    @Override
    public String toString() {
        return "ej2_Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    
    
    
    
    
    
}
