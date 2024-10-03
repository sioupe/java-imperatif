package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] tab1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] tab2 = {-1, 12, 17, 14, 5, -9, 0, 18};
        if (tab1.length >= tab2.length) {
            int[] tabRes = new int[tab1.length];
            for (int i = 0; i < tab1.length; i++) {
                if (i < tab2.length) {
                    tabRes[i] = tab1[i] + tab2[i];
                    System.out.println("tabRes [" + i + "] = " + tabRes[i]);
                } else {
                    tabRes[i] = tab1[i];
                    System.out.println("tabRes [" + i + "] = " + tabRes[i]);
                }
            }

        }

        if (tab1.length < tab2.length) {
            int[] tabRes = new int[tab2.length];
            for (int i = 0; i < tab2.length; i++) {
                if (i < tab1.length) {
                    tabRes[i] = tab1[i] + tab2[i];
                    System.out.println("tabRes [" + i + "] = " + tabRes[i]);
                } else {
                    tabRes[i] = tab2[i];
                    System.out.println("tabRes [" + i + "] = " + tabRes[i]);
                }
            }
        }
    }
}
