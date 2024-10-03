package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i]=i+1;
        }

        System.out.println(tab[0]);
        System.out.println(tab.length);
        System.out.println(tab[tab.length-1]);
        System.out.println(tab[4]);
        tab[4]=8;
        System.out.println(tab[4]);
    }
}
