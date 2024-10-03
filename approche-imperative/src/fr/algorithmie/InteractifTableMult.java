package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int nb = scanner.nextInt();
        while (nb <1 || nb>10){
            nb= scanner.nextInt();
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(nb+"*"+i+" = "+(nb*i));
        }
    }
}
