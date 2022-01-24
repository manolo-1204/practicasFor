package es.manu;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r1 = new Random();

        for (int i = 1; i <= 15; i++) {
            //int res = (int) Math.floor(Math.random() * 3);
            int res = r1.nextInt(3);
            if (res != 0) {
                System.out.println("Partido " + i + ": " + res );
            } else {
                System.out.println("Partido " + i + ": X");
            }
        }
    }
}
