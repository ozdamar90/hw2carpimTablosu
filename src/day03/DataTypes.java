package day03;

public class DataTypes {
    public static void main(String[] args) {
        //Escape characters
       /*String mesaj="Kisi ben Ahmet dedi.";
        System.out.println(mesaj);
        //atama yaptığımız tırnağın içinde çift tırnak kullanarak bir mesaj veya metin yazacak
         olursak ters slash kullanıyoruz.
         -Ancak atama yaptığımız çift tırnağın içerisinde tek tırnak kullanabiliriz.Bu tür characterlere escape characteri deniyor.
        //print"aynı satırda println ise bir alt satırda görüntü almamızı sağlar."
        */
        /*String mesaj="Kişi, \"Benim adım Ahmet\" dedi.";
        System.out.print(mesaj);
        System.out.println("Selam!");

         */

        String mesaj="Kişi, \"Benim adım Ahmet\" dedi.\n";
        System.out.print(mesaj);
        System.out.println("\tSelam!");
        final int pi=3; //Bir sayının değişmeden kalması için final kodunu kullanırız.
                        // buna ingilizce constant:Sabitleme diyoruz.

        int x,y,z;//değişkenlere bir atama yapmamışsak çalıştıramayız. mutlaka bir atama yapmamız lazım.
        x=y=z=1;

        System.out.println(x+y+z);//x+y+z; expresssion ifade diyoruz
        //satırın başından noktalı virgüle kadar olan kısma: statement diyoruz.

        //Tam sayılar Whole or integer numbers
        //Kesirli Sayılar (Floating point numbers)

        byte b=-101;
        short s=0;
        int i=500_000;
        long l=500_000_000_000_000L;

        double kilo = 72.8;
        float price = 45.5F;

        boolean dogruMu=false;
        boolean doluMu=true;
        boolean isAdult=true;

        char aKarakteri= 'A';
        char ucodeA='\u0041';
        System.out.println(aKarakteri);
        System.out.println(ucodeA);
                //type conversion - Tip dönüşümleri

        byte yas1=28;
        byte yas2=35;

       double toplamYas=yas1+yas2+5+3.7;
    //expression içinde en büyük veri tipi ne ise ona dönüştürülür.

        //unıcode table.com


        byte toplamYas2=(byte) (yas1+yas2);

        System.out.println("Toplam Yaş="+toplamYas2);

    }
}
