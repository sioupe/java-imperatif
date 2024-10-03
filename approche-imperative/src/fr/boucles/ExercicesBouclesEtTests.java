package fr.boucles;

public class ExercicesBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        for ( int nb : array){
            System.out.println(nb);
        }
        System.out.println("-------------------");
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.println(array[i]);
        }
        System.out.println("--------------------");
        for ( int nb : array){
            if (nb>3){
                System.out.println(nb);
            }
        }
    }
}
