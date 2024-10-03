package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int nb = scanner.nextInt();
        int tampon=0;
        for (int i = 1; i <= nb; i++) {
            tampon+=i;
        }
        System.out.println(tampon);
    }
}
