package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {
    public static void main(String[] args) {
        System.out.println("tu es le joueur 1 et l'ordi le joueur 2, le premier joueur à joué est choisi aléatoirement\ntu commence avec 21 batons\ntu ne dois pas etres le dernier à tiré un baton\n bonne chance ");
        int nbBaton =21;
        int joueur =(int)(1+(Math.random() * 1));
        Scanner scanner=new Scanner(System.in);
        int nbBatonHumain;
        while(nbBaton>0){
            if (joueur==1) {
                while ((nbBatonHumain = scanner.nextInt()) < 1 || nbBatonHumain > 3) {
                    System.out.println("tu ne peux prendre que 1 , 2 ou 3 batons à la fois");
                }
                nbBaton = nbBaton - nbBatonHumain;
                System.out.println(("il reste "+nbBaton+" batons"));

                joueur = 2;
            }
            if (joueur==2){
                nbBaton=nbBaton - (int)(1+(Math.random()*2));
                System.out.println(("il reste "+nbBaton+" batons"));

                joueur=1;
            }

        }
        System.out.println("le gagnant est le joueur " + joueur);
    }
}
