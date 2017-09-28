package PrimitiveToString;

public class lesson1 {

    public static void main(String[] args) {

        // Kullanılan Yöntemler String.valueOf yada Integer.toString gibi.

        int number_1 = 15;
        double number_2 = 30.124;
        float number_3 = 31.2f;

        String intToString, doubleToString, floatToString;

        intToString = Integer.toString(number_1); // toString
        doubleToString = Double.toString(number_2); // toString
        floatToString = String.valueOf(number_3); // valueOf

        System.out.println("Integer To String " + intToString);
        System.out.println("Double To String " + doubleToString);
        System.out.println("Float To String " + floatToString);





    }

}
