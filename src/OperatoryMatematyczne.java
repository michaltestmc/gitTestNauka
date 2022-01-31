// umożliwiają wykonanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;

        int addition = firstNumber + secondNumber; //10
        int subtraction = firstNumber - secondNumber; //-2
        int multiplication = firstNumber*secondNumber; //24
        int division = firstNumber/secondNumber; // 0,6667
        int mod = secondNumber%firstNumber; // 1 r 2

        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Wynik odejmowania: " + subtraction);
        System.out.println("Wynik mnożenia: " + multiplication);
        System.out.println("Wynik dzielenia: " + division); // wynik wyjdzie zero, żeby wyszedł z przecinkiem to float zamiast int
        System.out.println("Modulo: " + mod);

        firstNumber+=secondNumber; // firstNumber = firstNumber+secondNumber
        System.out.println("Po dodaniu: " + firstNumber); //10
        firstNumber-=secondNumber; // firstNumber - secondNumber;
        System.out.println("Po odejmowaniu: " + firstNumber); //4
        firstNumber*=secondNumber; // firstNumbmer*secondNumber
        System.out.println("Po mnożeniu: " + firstNumber); // 24
        firstNumber/=secondNumber; // firstNumber/secondNumber
        System.out.println("Po dzieleniu: "+ firstNumber); // 4
    }
}
