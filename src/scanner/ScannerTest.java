package scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerTest {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el dividendo");
        int dividendo = sc.nextInt();

        System.out.println("Ingrese el divisor");
        int divisor = sc.nextInt();


        try {
            int cociente = dividendo / divisor;
        } catch (ArithmeticException exception) {
            System.out.println("Hubo un error en la division:" + exception);
        }


        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");       // 0
        palabras.add("Mundo");      // 1
        palabras.add("Mate");       // 2
        palabras.add("celular");    // 3

        System.out.println(palabras);
        System.out.println("Ingrese el indice:");
        int indice = sc.nextInt();


        String elegida;
        try {
             elegida = palabras.get(indice);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error en la palabra: " + e.getMessage());
            elegida = palabras.getLast();
        }

        System.out.printf("Elegiste %s %n", elegida);

        sc.close();
        System.out.println("El programa termina aca");

    }



}
