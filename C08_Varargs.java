package day26_DateTime_Varangs;

import java.util.Arrays;

public class C08_Varargs {
    public static void main(String[] args) {
        topla(3,4);
        topla(3,4,5);
        topla(3,4,5,6);
        topla(1,2,3,4,5,6);
        topla(1,2,3,4,5,6,7);

    }

    public static void topla(int... a){
        System.out.println(Arrays.toString(a));
        int toplam=0;
        for(int each:a){

            toplam+=each;

        }
        System.out.println(toplam);


    /*
    Javada bir mthod paramtrlirn uygun argumente sahip method call oldugunda calisir.

    ornegin 2 int parametre varsa
    sadece 2 int argument ile method call yapıldiginda calisir.
    java aynı data turun sahip olmak sartiyla paramtre sayisini esnek tutabilmk icin
    varargs olusturmustur.
    variety of arguments
    varargs bir arraydir.Dolayısıyla array elementlerini istedigimiz isleme uygun olarak kullanabiliriz.



     */

    }
}

