/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.

• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.

• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public final class ej2_Televisor extends ej2_Electrodomestico {

    protected double pulgadas;
    protected boolean TDT;

    public ej2_Televisor() {
    }

    public ej2_Televisor(double pulgadas, boolean TDT, int precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    /*
    • Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
     */
    public ej2_Televisor crearTelevisor() {
        System.out.println("Datos televisor:");
        ej2_Electrodomestico el = super.crearElectrodomestico();
        System.out.println("Ingrese su tamaño en pulgadas");
        pulgadas = leer.nextDouble();
        System.out.println("Tiene sintonizador TDT incorporado ? s/n");
        String resp = leer.next();
        if (resp.equals("s")) {
            TDT = true;
        } else {
            TDT = false;
        }

        return new ej2_Televisor(pulgadas, TDT, el.getPrecio(), el.getColor(), el.getConsumoEnergetico(), el.getPeso());

    }

    /*
     Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
     */
    public int precioFinal(ej2_Televisor tele) {
        if (pulgadas > 40) {
            precio = (int) (precio * 1.30);
        }

        if (TDT == true) {
            precio = precio + 500;
        }
        System.out.println("El precio del televisor es de $" + precio);
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() + "ej2_Televisor{" + "pulgadas=" + pulgadas + ", TDT=" + TDT + '}';
    }

}
