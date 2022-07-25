package day06;

public class SwitchStatement {
    public static void main(String[] args) {

        //switch .. case
        //int dayNumber = 17;
/*        switch (dayNumber) {

            case 1:
                System.out.println("Pazartesi");break;
            case 2:
                System.out.println("Salı");break;
            case 3:
                System.out.println("Çarşamba");break;
            case 4:
                System.out.println("Perşembe");break;
            case 5:
                System.out.println("Cuma");break;
            case 6:
                System.out.println("Cumartesi");break;
            case 7:
                System.out.println("Pazar");break;
            default:
                System.out.println("Yanlış Girildi.");break;
        }*/
        int k1=5;
        int k2=10;

        switch (k1+k2){
            case 15:
                System.out.println("kargo için uygundur");break;

            case 20 :
                System.out.println("Kargo için uygun değil");break;

            default:
                System.out.println("Girilen verilenlerle hesaplama yapılamaz.");break;
        }

    }
}



