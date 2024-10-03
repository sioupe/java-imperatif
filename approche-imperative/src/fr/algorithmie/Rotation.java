package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] tab1 = {6,2,3,1,0};
        int tampon =tab1[0];
        for (int val : tab1){
            System.out.println(val);
        }
        System.out.println("----------");
        for (int i = 0; i < tab1.length; i++) {
            if (i==tab1.length-1){
                tab1[i]=tampon;
            }else {
                tab1[i] = tab1[i + 1];

            }
        }
        for (int val : tab1){
            System.out.println(val);
        }




    }
}
