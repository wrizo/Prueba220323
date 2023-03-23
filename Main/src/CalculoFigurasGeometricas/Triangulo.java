package CalculoFigurasGeometricas;

public class Triangulo {

    public double resultado;

    public double areaTriangulo(double base, double altura){

        resultado=(base*altura)/2;
        return resultado;
    }


    public double cuadradoArea() {
        return resultado * 2;
    }
    public double areaOtroTriangulo(double base, double altura){

        resultado=(base*altura)/2;
        return resultado;

    }
}
