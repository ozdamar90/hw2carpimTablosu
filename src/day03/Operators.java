package day03;

public class Operators {
    public static void main(String[] args) {

        //Operators
        //Arithmetic Operators
        /*
            Toplama : + --> operand1 ve operand2'nin değerlerini toplar.
            Çıkarma : - --> operand1 ve operand2'nin değerlerini farkını alır.
            çarpma  : * --> operand1 ve operand2'nin değerlerini çarpar.
            Bölme   : / --> operand1 ve operand2'ye böler.
            Mod alma: % --> operand1'in operand2'ye bölümünden kalanı kalır.
         */


        int sayi1=20;
        int sayi2=30;

        System.out.println("Toplam="+(sayi1+sayi2));

        int fark=sayi2-sayi1;
        System.out.println("Fark="+fark);

        double bölüm=(double) sayi2/sayi1;

        System.out.println("Bölüm="+bölüm);

        int result=sayi1*sayi2;
        System.out.println("Result="+result);

        int kalan=10%2;
        int kalan1=7%2;
        int kalan2=3%2;
        System.out.println("Kalan="+kalan);
        System.out.println("Kalan1="+kalan1);
        System.out.println("Kalan2="+kalan2);

        int sayi=5;
        System.out.println("Sayı=-->"+sayi);
        sayi++;
        System.out.println("Sayı=-->"+sayi);

        int a=3;
        int b=5;
        int alan=a*b;
        System.out.println("Alan="+alan);




    }
}
