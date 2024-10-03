package fr.algorithmie;

import java.util.Scanner;

public class InterractifFibonnaci {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int resultat = fibo(scanner.nextInt());
        System.out.println(resultat);
    }
    private static int fibo(int nb){
        if(nb==1){
            return 1;
        } else if (nb==0) {
            return 0;
        }else {
            return (fibo(nb-1)+fibo(nb-2));

        }
    }

}
