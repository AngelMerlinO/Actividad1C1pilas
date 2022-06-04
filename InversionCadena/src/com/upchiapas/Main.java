package com.upchiapas;
import com.upchiapas.models.Operacion;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] arreglo = new String[2];


        Operacion operacion = new Operacion();
        System.out.println("ingrese la cadena ");
        String cadena = teclado.next();
        arreglo = operacion.comparacion(cadena);
        System.out.println("El orden queda: " + arreglo[0] + " " + arreglo[1]);
    }
}
