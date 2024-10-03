package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int nb;
        int max= scanner.nextInt();
        for (int i = 0; i < 9; i++) {
            if ((nb=scanner.nextInt()) > max){
                max=nb;
            }

        }
        System.out.println("la plus grand valeur c'est "+max);
    }
}
