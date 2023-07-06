package org.example;

import org.example.modelos.Herramienta;
import org.example.modelos.Samurai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Samurai samurai= new Samurai();
        Samurai samuraidos= new Samurai();
        Herramienta herramienta= new Herramienta("Escopeta",90.0);
        Herramienta herramientaDos= new Herramienta();
        Scanner entradaPorTeclado= new Scanner(System.in);

        //Utilizar-accederver-modifcar-operar-revisa-validar
        // los atributos y metodos de una clase

        samurai.setNombres("Koshito micamoto");
        System.out.print("Digita la edad del 1 samurai: ");
        samurai.setEdad(entradaPorTeclado.nextInt());

       System.out.println("**********RESULTADOS**********");
        System.out.println("El samurai "+samurai.getNombres() +" tiene "+ samurai.getEdad() +" años.");


    }
}