package fr.operateurs;

public class DeclarationOperateur {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        boolean testEt = (a >0) && (b<10);
        System.out.println(testEt);
        boolean testOu = (a >0) || (b<10);
        System.out.println(testOu);

        a=a+1;
        System.out.println(a);
        a++;
        System.out.println(a);
        a+=1;
        System.out.println(a);
        String c = a>0 ? "a est plus grand que 0" : "a est inferieur à 0";
        System.out.println(c);
        String d = a>30 ? "a est plus grand que 30" : "a est inferieur à 30";
        System.out.println(d);

    }


}
