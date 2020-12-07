/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola_edd;

import java.util.Scanner;

public class Cola_EDD {

    
    public static void main(String[] args) {
        int opc = 0, elemento = 0;
        Colas opcion = new Colas();
        do {//para crear el menu y sea dinamico
            Scanner leer = new Scanner(System.in);
            System.out.println("1.-introduzca un elemento en la cola");
            System.out.println("2.descartar un elemento de la cola");
            System.out.println("3.-la cola esta vacia");
            System.out.println("4.-elemento ubicado al inicio de la cola");
            System.out.println("5.-tamaño de la cola");
            System.out.println("6.-Salir");
            System.out.println(" ");
            System.out.print("Elige una opcion:");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("introduza el elemento:");//opcion para ingresar elementos a la cola
                    elemento = leer.nextInt();
                    opcion.agregar(elemento);
                    break;
                case 2:
                    if (!opcion.estavacia()) {//opcion para sacar elementos de la cola
                        System.out.println("El elemento atendido es:" + opcion.quitar());
                    } else {
                        System.out.println("la cola esta vacia:");

                    }
                    break;
                case 3://opcion para saber si la cola esta vacia o si esta llena
                    if (!opcion.estavacia()) {
                        System.out.println("la cola no esta vacia");
                    } else {
                        System.out.println("la cola esta vacia");
                    }

                    break;
                case 4://opcion para saber que elemento se encuentra al inicio
                    if (!opcion.estavacia()) {
                        System.out.println("El elemento ubicado al inicio de la cola es:" + opcion.iniciocola());
                    } else {
                        System.out.println("la cola esta vacia");
                    }
                    break;
                case 5:
                    System.out.println("El tamaño de la cola es:" + opcion.tamaniocola());//opcion para saber el tamalo de la col
                    break;
                case 6://salir
                    System.out.println("finalizada");
                default:
                    System.out.println("opcion incorrecta");
                    break;

            }

        } while (opc != 6);
      
    }
    
}
