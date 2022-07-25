package day04;

public class RelationalOperators {
    public static void main(String[] args) {
        //Karşılaştırma ve İlişkisel operatörler;
        // ==, !=, >, <, >=, <=,

        /*int x=3;
        int y=5;

        //System.out.println(x==y);
        //System.out.println(x!=y);
        //System.out.println(x<y);
        //System.out.println(x>y);
        //System.out.println(x<=y);
        System.out.println(x>=y);*/

        //Kısa kenar ve uzun kenar uzunlaukları verilen iki dikdörtgenin alanlarını
        // ve çevrelerini karşılaştıran bir java programı yazınız.
        //Bİrinci dikdörtgen
        int kisaKenar1=8;
        int uzunKenar1=12;

        //İkinci dikdörtgen

        int kisaKenar2=8;
        int uzunKenar2=16;

        //Alanları Hesaplayalım

        int alan1=kisaKenar1*uzunKenar1;
        int alan2=kisaKenar2*uzunKenar2;

        //Çevreleri Hesaplayalım

        int cevre1=2*(kisaKenar1+uzunKenar1);
        int cevre2=2*(kisaKenar2+uzunKenar2);

        //Alan ve Çevreleri ekrana yazdır.
        System.out.println("Alan 1= "+alan1);
        System.out.println("Alan 2= "+alan2);
        System.out.println("Çevre 1= "+ cevre1);
        System.out.println("Çevre 2= "+ cevre2);

        //Alanları karşılaştıralım

        if (alan1>alan2){
            System.out.println("Birinci dikdörtgenin alanı daha büyüktür.");
        }else if (alan1<alan2){
            System.out.println("İkinci dikdörtgenin alanı daha büyüktür.");

        }
        else{
            System.out.println("İki dikdörtgenin alanı eşittir.");
        }

        //Çevreleri Karşılaştıralım
        if (cevre1>cevre2){
            System.out.println("Birinci dikdörtgenin çevresi daha büyüktür.");
        }else if (cevre1<cevre2){
            System.out.println("İkinci dikdörtgenin çevresi daha büyüktür.");

            }
        else {
            System.out.println("İki dikdörtgenin çevresi eşittir.");

        }




    }
}
