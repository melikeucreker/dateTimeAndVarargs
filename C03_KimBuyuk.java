package day26_DateTime_Varargs;

import java.time.LocalDate;
import java.util.Scanner;

public class C03_KimBuyuk {


    public static void main(String[] args) {
        //kullanicdan 2 farkli kisinin isim,dogum tarihini gun ay yılını alıp
        //hangi tarihte dogan kisinin daha buyuk oldugunu yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk kisinin ismini giriniz");
        String isim1=scan.nextLine();
        System.out.println("ikinci kisinin ismini girin");
        String isim2=scan.nextLine();
        System.out.println("İlk kisinin dogum tarihini gün,ay,yil olarak girin.");
        int gun=scan.nextInt();
        int ay=scan.nextInt();
        int yil=scan.nextInt();
        LocalDate tarih1=LocalDate.of(yil,ay,gun);

        System.out.println("İkinci kisinin dogum tarihini gün,ay,yil olarak girin.");

        gun=scan.nextInt();
        ay=scan.nextInt();
        yil=scan.nextInt();
        LocalDate tarih2=LocalDate.of(yil,ay,gun);

        System.out.println(tarih2.isAfter(tarih1)?"Buyuk olan:"+isim1:"Buyuk olan:"+isim2);


    }
}