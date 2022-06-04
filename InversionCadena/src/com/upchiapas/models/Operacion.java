package com.upchiapas.models;


import java.util.Stack;

public class Operacion {
    private String auxpila="",auxpila2="";


    public String[] comparacion(String cadena){
        Stack <Character> pila = new Stack<Character>();
        Stack <Character> pila2 = new Stack<Character>();
        String[] arreglo = new String[2];
        for ( int i=0; i<cadena.length();i++){
            if(cadena.charAt(i) == '+' || cadena.charAt(i) == '-' || cadena.charAt(i) == '/'||cadena.charAt(i) == '*' ){
                pila.push(cadena.charAt(i));

            }else {
                pila2.push(cadena.charAt(i));
            }

        }
        while (!pila.isEmpty()){
            auxpila = auxpila + pila.pop();

        }
        while (!pila2.isEmpty()){
            auxpila2 = auxpila2 + pila2.pop();

        }
         arreglo[0] = auxpila;
         arreglo[1] = auxpila2;
         return arreglo;
    }

}
