package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] ville = {"paris", "lyon", "montpellier", "marseille","nimes"};
        System.out.println(ville[0]+" "+ville[1]+" "+ville[2]+" "+ville[3]+" "+ville[4]);
        System.out.println(ville.length);
        ville[3]="Reims";
        System.out.println(ville[0]+" "+ville[1]+" "+ville[2]+" "+ville[3]+" "+ville[4]);

    }
}
