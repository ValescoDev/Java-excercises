package prectica1;

import java.util.Scanner;

public class Practica {
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

// Ejercicio 1: Calcular el área de un triángulo
    System.out.println("Ejercicio 1: Calcular el área de un triángulo");
    double a, b, c;
    System.out.print("Ingrese el lado a: ");
    a = sc.nextDouble();
    System.out.print("Ingrese el lado b: ");
    b = sc.nextDouble();
    System.out.print("Ingrese el lado c: ");
    c = sc.nextDouble();
    double areaTriangulo = calcularAreaTriangulo(a, b, c);
    if (areaTriangulo != -1) {
        System.out.println("El área del triángulo es: " + areaTriangulo);
    }

// Ejercicio 2: Calcular el área y la circunferencia de un círculo
    System.out.println("\n Ejercicio 2: Calcular el área y la circunferencia de un círculo");
    System.out.print("Ingrese el radio del círculo: ");
    double radio = sc.nextDouble();
    double areaCirculo = calcularAreaCirculo(radio);
    double circunferencia = calcularCircunferencia(radio);
    System.out.println("El área del círculo es: " + areaCirculo);
    System.out.println("La circunferencia del círculo es: " + circunferencia);

// Ejercicio 3: Mostrar la hora del sistema
    System.out.println("\n Ejercicio 3: Mostrar la hora del sistema");
    mostrarHora();

// Ejercicio 4: Convertir segundos a horas, minutos y segundos
    System.out.println("\n Ejercicio 4: Convertir segundos a horas, minutos y segundos");
    System.out.print("Ingrese la cantidad de segundos: ");
    int segundos = sc.nextInt();
    String tiempo = convertirSegundos(segundos);
    System.out.println(tiempo);

// Ejercicio 5: Calcular el volumen de una esfera
    System.out.println("\n Ejercicio 5: Calcular el volumen de una esfera");
    System.out.print("Ingrese el radio de la esfera: ");
    radio = sc.nextDouble();
    double volumenEsfera = calcularVolumenEsfera(radio);
    System.out.println("El volumen de la esfera es: " + volumenEsfera);

// Ejercicio 6: Calcular el volumen de un cono
    System.out.println("\n Ejercicio 6: Calcular el volumen de un cono");
    System.out.print("Ingrese el radio de la base del cono: ");
    radio = sc.nextDouble();
    System.out.print("Ingrese la altura del cono: ");
    double altura = sc.nextDouble();
    double volumenCono = calcularVolumenCono(radio, altura);
    System.out.println("El volumen del cono es: " + volumenCono);

// Ejercicio 7: Calcular el área superficial de un cubo
    System.out.println("\n Ejercicio 7: Calcular el área superficial de un cubo");
    System.out.print("Ingrese el lado del cubo: ");
    double lado = sc.nextDouble();
    double areaCubo = calcularAreaCubo(lado);
    System.out.println("El área superficial del cubo es: " + areaCubo);
        
// Ejercicio 8: Calcular el área y el perímetro de un rectángulo
    System.out.println("\n Ejercicio 8: Calcular el área y el perímetro de un rectángulo");
    System.out.print("Ingrese la base del rectángulo: ");
    double base = sc.nextDouble();
    System.out.print("Ingrese la altura del rectángulo: ");
    double alturaRectangulo = sc.nextDouble();
    double areaRectangulo = calcularAreaRectangulo(base, alturaRectangulo);
    double perimetroRectangulo = calcularPerimetroRectangulo(base, alturaRectangulo);
    System.out.println("El área del rectángulo es: " + areaRectangulo);
    System.out.println("El perímetro del rectángulo es: " + perimetroRectangulo);

    sc.close();
    }

 // Métodos para los cálculos
    public static double calcularAreaTriangulo(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        if (Double.isNaN(area)) {
            System.out.println("Los lados ingresados no forman un triángulo válido");
            return -1;
        }
        return area;
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularCircunferencia(double radio) {
        return 2 * Math.PI * radio;
    }

    public static void mostrarHora() {
        System.out.println("La hora actual es: " + java.time.LocalTime.now());
    }

    public static String convertirSegundos(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segs = segundos % 60;
        return horas + " horas, " + minutos + " minutos y " + segs + " segundos";
    }

    public static double calcularVolumenEsfera(double radio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }

    public static double calcularVolumenCono(double radio, double altura) {
        return (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;
    }

    public static double calcularAreaCubo(double lado) {
        return 6 * Math.pow(lado, 2);
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetroRectangulo(double base, double altura) {
        return 2 * base + 2 * altura;
    }
}