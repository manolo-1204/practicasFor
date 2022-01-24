package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Hasta que número quieres saber los impares? ");
        n = entrada.nextInt();

        System.out.println("Los números impares entre 0 y " + n + " son:");
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}
