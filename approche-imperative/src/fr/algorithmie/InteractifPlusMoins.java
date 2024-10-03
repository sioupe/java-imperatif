package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int nb = scanner.nextInt();
        int nbReponse =(int)(1+Math.random() * 100);
        int coup=1;
        while(nb!=nbReponse){
            if (nb<nbReponse) {
                System.out.println("c'est plus");
            }else if(nb>nbReponse){
                System.out.println("c'est moins");
            }
            nb=scanner.nextInt();
            coup++;
        }
        System.out.println("bravo tu as réussi en "+coup+" coup");

    }
}
