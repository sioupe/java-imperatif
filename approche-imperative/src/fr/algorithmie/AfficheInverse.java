package fr.algorithmie;

public class AfficheInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        for (int nb : array){
            System.out.println(nb);
        }
        System.out.println("---------");
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.println(array[i]);

        }
        System.out.println("----------------");
        int[] arraycopy = new int[array.length];
        for (int i =0 ; i <array.length-1 ; i++){
            arraycopy[i]=array[i];
            System.out.println("arraycp["+i+"] = " +arraycopy[i] +" array["+i+"] = " +array[i]);
        }

    }
}
