package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] tab1 = {6,2,3,1,0};

        boolean controle1 = tab1.length!=0 && (tab1[0]==6||tab1[tab1.length-1]==6);


        System.out.println(controle1 );

    }
}
