package AritmetikOperatorler;

public class lesson1 {

    // - + % / *

    public static void main(String[] args) {

        float number_1 = 3.3f;
        float number_2 = 3.4f;

        int toplamaIslemi = (int) (number_1 + number_2);
        int cikarmaIslemi = (int) (number_1 - number_2);
        int carpmaIslemi = (int) (number_1 * number_2);
        int bolmeIslemi = (int) (number_1 / number_2);
        int modIslemi = (int) (number_1 % number_2);

        System.out.println("Toplama İşlemi = " + toplamaIslemi);
        System.out.println("Çıkarma İşlemi = " + cikarmaIslemi);
        System.out.println("Çarpma İşlemi = " + carpmaIslemi);
        System.out.println("Bölme İşlemi = " + bolmeIslemi);
        System.out.println("Mod İşlemi = " + modIslemi);

        // Bir sayıyı negatif hale getirmek için

        System.out.println("Negatif Hali " + (-toplamaIslemi));


    }

}
