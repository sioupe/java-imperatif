package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("---------------");

        for (int i = 0; i <= 10; i=i+2) {
            System.out.println(i);
        }
        System.out.println("---------------");
        for (int i = 1;i < 10; i=i+2) {
            System.out.println(i);
        }
        System.out.println("---------------");
        int j=1;
        while (j<=10) {
            System.out.println(j);
            j++;
        }
        j=0;
        System.out.println("---------------");
        while (j<=10) {
            if (j % 2 == 0){
                System.out.println(j);
            }
            j++;
        }
        j=0;
        System.out.println("---------------");

        while (j<=10) {
            if (j % 2 == 1){
                System.out.println(j);
            }
            j++;
        }
    }
}

