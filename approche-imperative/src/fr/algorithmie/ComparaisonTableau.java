package fr.algorithmie;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
        int compteur =0;
        for(int val1:array1) {
            for (int val2:array2){
                if(val1==val2) {
                    compteur++;
                }
            }
        }
        System.out.println("il y a "+ compteur+" valeur en commun");

    }
}
