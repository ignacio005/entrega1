package mates;

import java.util.ArrayList;

public class Funciones {
    //1
    public static int suma(int n){
        int acumulado=0;
        for (int i =1; i<=n;i++){
            acumulado+=i;
        }
        return acumulado;
    }
    //2
    public static int factorial(int n){
        int acumulado=1;
        for (int i=1;i<=n; i++){
            acumulado*=i;

        }
        return acumulado;
    }
    //3
    public static int potencia(int n, int base){
        int acumulado=1;
        for (int i = 0; i<n; i++ ){
            acumulado*=base;
        }

        return acumulado;
    }
    //4
    public static int lista(int elemento1, int elemento2, int elemento3, int elemento4){
        ArrayList <Integer> lista= new ArrayList<>();
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
    //5
    public static double media(double elemento1, double elemento2, double elemento3, double elemento4){
        ArrayList <Double> lista= new ArrayList<>();
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
    //6
    public static double desviacion(int elemento1, int elemento2, int elemento3, int elemento4){
    ArrayList<Integer>lista=new ArrayList<>();
    lista.add(elemento1);
    lista.add(elemento2);
    lista.add(elemento3);
    lista.add(elemento4);
    double acumulado = 0;
    for (int i= 0; i<lista.size();i++){
        acumulado+= (double) Math.pow(lista.get(i) - Funciones.media(1,2,3,4),2)/(double) lista.size();
    }
        return acumulado;
    }
    //7
    public static int sumapares(int n){
        int acumulado=0;
        for (int i =1; i<=n;i++){
            if (i % 2==0){
                acumulado+=i;
            }
        }
        return acumulado;
    }
    //8
    public static int listaenteros(int elemento1, int elemento2, int elemento3, int elemento4){
        ArrayList <Integer> listaenteros= new ArrayList<>();
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
    //9
    public static void obtenerlistapares(int elemento1, int elemento2, int elemento3,int elemento4){
        ArrayList <Integer> listaenteros= new ArrayList<>();
        listaenteros.add(elemento1);
        listaenteros.add(elemento2);
        listaenteros.add(elemento3);
        listaenteros.add(elemento4);
        System.out.println("La nueva lista de numeros pares es: ");
        for (Integer elemento:listaenteros){
            if (elemento % 2==0){
                ArrayList <Integer> listapares= new ArrayList<>();
                listapares.add(elemento);
                for (int i:listapares){
                    System.out.println(i);
                }
            }
        }


    }
    //10
    public static void listapares(int n){

        System.out.println("La lista de los primeros números pares hasta n asumiendo n ≥ 2 son: ");
        for (int i = 1; i<=n; i++){
            if (i % 2==0){
                System.out.println(i);
            }
        }

    }
    //11
    public static int productoescalar(int a, int b, int c, int d, int e, int f){
        ArrayList<Integer>lista1=new ArrayList<>();
        lista1.add(a);
        lista1.add(b);
        lista1.add(c);
        ArrayList<Integer>lista2=new ArrayList<>();
        lista2.add(d);
        lista2.add(e);
        lista2.add(f);
        int acumulado=0;
        for (int i=0; i<lista1.size();i++){
            acumulado+= lista1.get(i)* lista2.get(i);
        }

        return acumulado;
    }


}
