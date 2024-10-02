package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] tab = {8, -7, 12, 1, -2, 14, 17, 9};
        System.out.println(tab[0]);
        System.out.println(tab.length);
        System.out.println(tab[(tab.length) - 1]);
      //  System.out.println(tab[10]); //out of indexe le tableau n'a que 8 case du coup en cherchant a l'indexe 10 qui est la 11e case ben ca marche pas
    }
}

