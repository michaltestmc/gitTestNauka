public class TypyObiektowe {

    public static void main(String[] args) {

        // liczby stałoprzecinkowe
        Byte firstNumber = 12; // 1 bajt -128 do 128
        Short secondNumber = 32442; // 2 bajty -32768 do 32768
        Integer thirdNumber = 32768998; // 4 bajty -2 147 483 648 do 2 147 483 648
        Long fourthNumber = 231332122L; // -2^63 do (2^63)-1

        // liczby zmiennoprzecinkowe
        Float fifthNumber = 4.99934F; // 4 bajty - max ok 6-7 cyfr po przecinku
        Double sixthNumber = 3.9999999999990; // 8 bajtów - max ok 15 cyfr po przecinku

        // wartość logiczna
        Boolean prawda = true;
        Boolean falsz = false;

        // pojedynczy znak
        String litera = "A";

        //ciągi znaków
        String hello = "Hello Michał";

        System.out.println(hello.charAt(1));

    }
}
