package fr.algorithmie;

public class SommeDeTableaux {
    public static void main(String[] args) {
        int[] tab1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] tab2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
        int[] tabRes = new int[tab1.length];
        for (int i = 0; i < tab1.length ; i++) {
            tabRes[i]=tab1[i]+tab2[i];
            System.out.println("tab1 "+ tab1[i] +" + tab2 "+ tab2[i]+" = tabRes "+ tabRes[i]);
        }
    }
}
