package aplicacion;

import mates.Funciones;

public class Principal {
    public static void main(String[] args) {
        System.out.println("La suma de los numeros hasta el 10 es " + Funciones.suma(10));
        System.out.println("El factorial del 5 es " + Funciones.factorial(5));
        System.out.println("La base de la potencia n-esima es 2, el resultado es " + Funciones.potencia(2));
        System.out.println("La suma de los elementos de la lista es " + Funciones.lista());
        System.out.println("La media de los elementos de la lista es " + Funciones.media());
        System.out.println("La suma de los primeros numeros pares hasta n asumiendo n ≥ 2 es " + Funciones.sumapares(8));
        System.out.println("La suma de los elementos pares de una lista de enteros " + Funciones.listaenteros());
        Funciones.obtenerlistapares();
        Funciones.listapares();
        System.out.println("El producto escalar es " + Funciones.productoescalar());


    }
}