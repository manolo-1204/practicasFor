package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num, div = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número: " );
        num = entrada.nextInt();

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                div++;
            }
        }
        if (div > 1) {
            System.out.println("El número " + num + " no es primo");
        } else {
            System.out.println("El número " + num + " es primo");
        }
    }
}
