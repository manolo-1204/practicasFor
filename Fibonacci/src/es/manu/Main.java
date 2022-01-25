package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long n1 = 1, sum = 1, n2 = 0, count;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe un num: ");
        count = entrada.nextInt();

       /* 1sum + 1n1 = 2sum;
        2sum + 1n1 = 3sum;
        3sum + 2n1 = 5sum;/**/

        for (int i = 0; i < count; i++) {
            System.out.println(n1);
            sum = n1 + n2;
            n2  = n1;
            n1  = sum;
        }
    }
}
