/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola_edd;

public class Colas {
      Nodo inicio, fin;
    int tamano; // se declara una variable de tipo entero

    public Colas() { // metodo basico para empezar a agregar los datos en la cola
        inicio = fin = null;
        tamano = 0;

    }

    public boolean estavacia() { // se crea un metodo para combrobar si esta vacia 
        return inicio == null; // se retorna para saber si esta vacia o no.

    }

    public void agregar(int elemento) {//metodo para insertar elementos a la cola
        Nodo nuevo = new Nodo(elemento);
        if (estavacia()) {
            inicio = nuevo; // esto lo ponemos con el fin de saber que nuevos elemntos vamos insertando

        } else {
            fin.sg = nuevo;

        }
        fin = nuevo;
        tamano++; // incrementamos el tamaño
    }

    public int quitar() {//metodo para quitar un elemento
        int aux = inicio.dato;
        inicio = inicio.sg;
        tamano--;
        return aux; // se retorna el auxiliar

    }

    public int iniciocola() {
        return inicio.dato;

    }

    public int tamaniocola() {//Tamaño de la cola
        return tamano;

    }
}

    

