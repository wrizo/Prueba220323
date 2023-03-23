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

        do {
            System.out.println("Ingrese una opción:");
            opcion = Integer.parseInt(inputUsuario.nextLine());
            Scanner valorInput = new Scanner(System.in);
            Double valor, base;

            switch (opcion) {
                case 0:
                    System.out.println("Hasta Luego, gracias por usar el sistema");
                    break;
                case 1:
                    System.out.println("Ha seleccionado calcular el área del , la fórmula es (lxl) ");
                    System.out.println("Ingrese el valor del Lado:");
                    valor = Double.parseDouble(valorInput.nextLine());
                    cuadrado cuadrado = new cuadrado();
                    System.out.println("el valor del lado es:" + cuadrado.calcular_area_cuadrado(valor));
                    break;
                case 2:
                    System.out.println("Ha seleccionado calcular el área del Triángulo, la fórmula es (bxa)/2 ");
                    System.out.println("Ingrese el valor de la base:");
                    base = Double.parseDouble(valorInput.nextLine());
                    System.out.println("Ingrese el valor de la altura:");
                    valor = Double.parseDouble(valorInput.nextLine());
                    Triangulo triangulo = new Triangulo();
                    System.out.println("el valor del lado es:" + triangulo.areaTriangulo(base, valor));
                    triangulo.cuadradoArea();
                    break;
                case 3:
                    System.out.println("Ha seleccionado calcular el área del círculo, la fórmula es pi*r2 ");
                    System.out.println("Ingrese el valor del Lado:");
                    valor = Double.parseDouble(valorInput.nextLine());
                    Circulo circulo = new Circulo();
                    System.out.println("el valor del lado es:" + circulo.CalCularArea(valor));
                    break;
            }

        } while (opcion != 0);
    }
}
