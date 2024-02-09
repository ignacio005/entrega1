package mates;

import java.util.ArrayList;

public class Funciones {
    public static int suma(int n){
        int acumulado=0;
        for (int i =1; i<=n;i++){
            acumulado+=i;
        }
        return acumulado;
    }
    public static int factorial(int n){
        int acumulado=1;
        for (int i=1;i<=n; i++){
            acumulado*=i;

        }
        return acumulado;
    }
    public static int potencia(int n){
        int acumulado=1;
        for (int i = 0; i<=n; i++ ){
            acumulado*=2;
        }

        return acumulado;
    }
    public static int lista(){
        ArrayList <Integer> lista= new ArrayList<>();
        int elemento1=1;
        int elemento2=2;
        int elemento3=3;
        int elemento4=4;
        lista.add(elemento1);
        lista.add(elemento2);
        lista.add(elemento3);
        lista.add(elemento4);
        int acumulado=0;
        for (Integer elemento:lista){
            acumulado+=elemento;

        }

        return acumulado;
    }
    public static double media(){
        ArrayList <Double> lista= new ArrayList<>();
        double elemento1=1;
        double elemento2=2;
        double elemento3=3;
        double elemento4=4;
        lista.add(elemento1);
        lista.add(elemento2);
        lista.add(elemento3);
        lista.add(elemento4);
        double acumulado=0;
        for (Double elemento:lista){
            acumulado+=elemento;

        }
        double media = acumulado/lista.size();

        return media;
    }
    public static int sumapares(int n){
        int acumulado=0;
        for (int i =1; i<=n;i++){
            if (i % 2==0){
                acumulado+=i;
            }
        }
        return acumulado;
    }
    public static int listaenteros(){
        ArrayList <Integer> listaenteros= new ArrayList<>();
        int elemento1=1;
        int elemento2=2;
        int elemento3=3;
        int elemento4=4;
        listaenteros.add(elemento1);
        listaenteros.add(elemento2);
        listaenteros.add(elemento3);
        listaenteros.add(elemento4);
        int acumulado=0;
        for (Integer elemento:listaenteros){
            if (elemento % 2==0){
                acumulado+=elemento;
            }
        }

        return acumulado;
    }
    public static void obtenerlistapares(){
        ArrayList <Integer> listaenteros= new ArrayList<>();
        int elemento1=1;
        int elemento2=2;
        int elemento3=6;
        int elemento4=11;
        listaenteros.add(elemento1);
        listaenteros.add(elemento2);
        listaenteros.add(elemento3);
        listaenteros.add(elemento4);
        int acumulado=0;
        System.out.println("La nueva lista de numeros pares es: ");
        for (Integer elemento:listaenteros){
            if (elemento % 2==0){
                acumulado+=elemento;
                ArrayList <Integer> listapares= new ArrayList<>();
                listapares.add(elemento);
                for (int i:listapares){
                    System.out.println(i);
                }
            }
        }


    }
    public static void listapares(){
        ArrayList <Integer> listaenteros= new ArrayList<>();
        int elemento1=1;
        int elemento2=2;
        int elemento3=3;
        int elemento4=4;
        int elemento5=5;
        int elemento6=6;
        int elemento7=7;
        int elemento8=8;
        int elemento9=9;
        listaenteros.add(elemento1);
        listaenteros.add(elemento2);
        listaenteros.add(elemento3);
        listaenteros.add(elemento4);
        listaenteros.add(elemento5);
        listaenteros.add(elemento6);
        listaenteros.add(elemento7);
        listaenteros.add(elemento8);
        listaenteros.add(elemento9);
        int acumulado=0;
        System.out.println("La lista de numeros pares es: ");
        for (Integer elemento:listaenteros){
            if (elemento % 2==0){
                acumulado+=elemento;
                ArrayList <Integer> listapares= new ArrayList<>();
                listapares.add(elemento);
                for (int i:listapares){
                    System.out.println(i);
                }
            }
        }


    }
    public static int productoescalar(){
        ArrayList<Integer>lista1=new ArrayList<>();
        int a=1;
        int b=2;
        int c=3;
        lista1.add(a);
        lista1.add(b);
        lista1.add(c);
        ArrayList<Integer>lista2=new ArrayList<>();
        int d=2;
        int e=4;
        int f=6;
        lista1.add(d);
        lista1.add(e);
        lista1.add(f);
        int resultado=a*d+b*e+c*f;

        return resultado;
    }


}
