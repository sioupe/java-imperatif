package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        boolean condArret =false;
        Scanner scanner=new Scanner(System.in);
        int[] tab=new int[0];
        int[] tabtampon=new int[0];
        while(!condArret){
            System.out.println("tape 1 pour ajouter un nombre au tableau \ntape 2 pour voir le tableau");
            switch(scanner.nextInt()){
                case 1:
                    System.out.println("ecrit un nombre a ajouter");
                    tabtampon=new int[tabtampon.length+1];
                    for (int i = 0; i < tab.length; i++) {
                        tabtampon[i]=tab[i];
                    }
                    tab=new int[tab.length+1];
                    for (int i = 0; i < tab.length; i++) {
                        tab[i]=tabtampon[i];
                    }
                    tab[tab.length-1]= scanner.nextInt();
                    break;
                case 2:
                    if (tab.length == 0) {
                        System.out.println("ton tableau est vide");
                    }
                    for (int val:tab){
                        System.out.println(val);
                    }
                    condArret=true;
                    break;
                default:
                    System.out.println("ecrit 1 ou 2 pitit chenapan");

            }
        }
    }
}
