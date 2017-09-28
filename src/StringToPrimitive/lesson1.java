package StringToPrimitive;

public class lesson1 {

    public static void main(String[] args) {

        // Kullanılan yöntemler. Integer.valueOf yada Integer.parseInt gibi.

        String number1, number2, number3;

        number1 = "3.14"; // float or double
        number2 = "34"; // ınteger
        number3 = "3.1555"; // double or float

        float stringToFloat = Float.parseFloat(number1);
        int stringToInteger = Integer.parseInt(number2);
        double stringToDouble = Double.parseDouble(number3);

        // double stringToDouble2 = Double.valueOf(number3);


        System.out.println("String to float " + stringToFloat);
        System.out.println("String to Integer   " + stringToInteger);
        System.out.println("String to Double    " + stringToDouble);

    }


}
