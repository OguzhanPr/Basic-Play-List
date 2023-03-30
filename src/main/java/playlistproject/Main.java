package playlistproject;

import java.util.Scanner;

public class Main {
    private static Sarkicilar sarkicilar=new Sarkicilar(); //Baska bir objeyi class'imizin özelligi olarak ekledik ==> composition
    private static Scanner scanner = new Scanner(System.in);

    public static void islemleriBastir(){
        System.out.println("\t 0- Islemleri Goruntule");
        System.out.println("\t 1- Sarkicilari Goruntule");
        System.out.println("\t 2- Sarkici Ekle");
        System.out.println("\t 3- Sarkici Güncelle");
        System.out.println("\t 4- Sarkici Sil");
        System.out.println("\t 5- Sarkici Ara");
        System.out.println("\t 6- Uygulamadan Cik");
    }

    public static void main(String[] args) {

        System.out.println("\t Sarkici Uygulamasina Hosgeldiniz...");

        islemleriBastir();

        boolean cikis = false;
        int islem;

        //Burada System.exit() kullanabilir miydim?
        while(!cikis){
            System.out.println("Bir islem seciniz :");
            islem=scanner.nextInt();
            scanner.nextLine();

            switch (islem){

                case 0:
                    islemleriBastir();
                    break;
                case 1:
                    //sarkiciGoruntule();
                    sarkicilar.sarkicilariBastir();
                    break;
                case 2:
                    sarkiciEkle();
                    break;
                case 3:
                    sarkiciGuncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis=true;
                    System.out.println("Uygulamadan cikiliyor...");
                    break;
            }
        }
    }

    private static void ara() {
        System.out.println("Aramak istediginiz sarkici : ");
        String isim = scanner.nextLine();
        sarkicilar.sarkiciAra(isim);
    }

    private static void sil() {
        System.out.println("Silmek istediginiz pozisyon (1,2,3) : ");
        int poz = scanner.nextInt();
        scanner.nextLine();
        sarkicilar.sarkiciSil(poz-1);
    }

    private static void sarkiciGuncelle() {
        System.out.println("Guncellemek istediginiz pozisyon (1,2,3) : ");
        int poz= scanner.nextInt();
        scanner.nextLine();

        String yeniIsim = scanner.nextLine();
        sarkicilar.sarkiciGuncelle(yeniIsim, poz-1);

    }

    private static void sarkiciEkle() {
        System.out.println("Eklemek istediginiz sarkicinin ismi : ");
        String isim = scanner.nextLine();
        sarkicilar.sarkiciEkle(isim);
    }

    private static void sarkiciGoruntule() {
        sarkicilar.sarkicilariBastir();
    }
}
