package aplicacion;

import mates.Funciones;

public class Principal {
    public static void main(String[] args) {
        System.out.println("La suma de los numeros hasta el 10 es " + Funciones.suma(10));
        System.out.println("El factorial del 5 es " + Funciones.factorial(5));
        System.out.println("La potencia n-esima de un número es " + Funciones.potencia(2,2));
        System.out.println("La suma de los elementos de la lista es " + Funciones.lista(1,2,3,4));
        System.out.println("La media de los elementos de la lista es " + Funciones.media(1,2,3,4));
        System.out.println("La desviación tipica es " + Funciones.desviacion(1,2,3,4));
        System.out.println("La suma de los primeros numeros pares hasta n asumiendo n ≥ 2 es " + Funciones.sumapares(8));
        System.out.println("La suma de los elementos pares de una lista de enteros " + Funciones.listaenteros(1,2,3,4));
        Funciones.obtenerlistapares(1,2,6,11);
        Funciones.listapares(9);
        System.out.println("El producto escalar es " + Funciones.productoescalar(1,2,3,2,4,6));


    }
}