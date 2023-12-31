/*
Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
 */
package guia3_estructurasdecontrol;

import java.util.Scanner;

public class EjercicioExtra5 {

    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        String socio;
        int costoT;
        System.out.println("Tipo de Socio:");
        socio = leer.next();
        System.out.println("Costo del tratamiento: ");
        costoT = leer.nextInt();
        
        switch (socio.toUpperCase()) {
            case "A":
                System.out.println("El costo del tratamiento es: " + (costoT * 0.5));
                break;
            case "B":
                System.out.println("El costo del tratamiento es: " + (costoT * 0.65));
                break;
            case "C":
                System.out.println("El costo del tratamiento es: " + costoT);
                break;
            default:
                System.out.println("Socio no valido");
                break;
        }
    }
}
