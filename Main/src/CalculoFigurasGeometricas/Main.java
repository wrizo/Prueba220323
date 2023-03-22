package CalculoFigurasGeometricas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUsuario = new Scanner(System.in);
        Integer opcion;

        System.out.println("Bienvenidos al sistema de cálculo de área!");
        System.out.println("Están disponibles las siguientes opciones para calcular:");
        System.out.println("Opción 1 - Calular el área del Cuadrado:");
        System.out.println("Opción 2 - Calular el área del Triangulo:");
        System.out.println("Opción 3 - Calular el área del Círculo:");
        System.out.println("Opción 4 - Calular el área del Círculo:");

        do {
            System.out.println("Ingrese una opción:");
            opcion = Integer.parseInt(inputUsuario.nextLine());
            Scanner valorInput = new Scanner(System.in);
            Double valor;

            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado calcular un cuadrado la fórmula es (lxl) ");
                    System.out.println("Ingrese el valor del Lado ");
                    valor = Integer.parseInt(valorInput.nextLine());
                    break;


            }

        } while (opcion != 0);
    }
}