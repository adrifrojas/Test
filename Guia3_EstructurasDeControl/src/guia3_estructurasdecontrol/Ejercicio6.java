/*Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú: El usuario deberá elegir una opción y el
programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del 
programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
    MENU
    1. Sumar
    2. Restar
    3. Multiplicar
    4. Dividir
    5. Salir
    elija opcion:*/
package guia3_estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2, opcion;
        String respuesta;
        System.out.println("Ingrese 2 numeros: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        do {
             System.out.println("Elija una opcion del menu: \n"
                + "1. Sumar \n"
                + "2. Restar \n" 
                + "3. Multiplicar \n"
                + "4. Dividir \n"
                + "5. Salir \n"
                + "Elija opcion: ");
                opcion = leer.nextInt();
                
                switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                 case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multipliacion es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La division es: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir? s/n");
                    respuesta = leer.next();
                    if (respuesta.equalsIgnoreCase("s")) {
                    }else{
                        break;
                    }
                    break;
                default:
                    System.out.println("Numero Incorrecto!");
            }
        } while (opcion != 5);
    }
}
