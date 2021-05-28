package ejercicio2;

import java.util.Scanner;

public class mainEjercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Creando un Circulo");
        System.out.println("Ingrese el radio del Circulo: ");
        Circulo circulo = new Circulo(scanner.nextDouble());
        System.out.println(circulo.toString());

        System.out.println("Crando un Triangulo");
        System.out.println("Ingrese la base: ");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura: ");
        double altura = scanner.nextDouble();
        Triangulo triangulo = new Triangulo(base,altura);
        System.out.println(triangulo.toString());

        System.out.println("Creando Rectangulo");
        System.out.println("Ingrese la base: ");
        double largo = scanner.nextDouble();
        System.out.println("Ingrese la altura : ");
        double ancho = scanner.nextDouble();
        Rectangulo rectangulo = new Rectangulo(largo,ancho);
        System.out.println(rectangulo.toString());

        FiguraGeometrica[] arr = {circulo, triangulo, rectangulo};
        System.out.println("El Area promedio de las figuras es " + AreaUtils.areaPromedio(arr));


        scanner.close();
    }
}
