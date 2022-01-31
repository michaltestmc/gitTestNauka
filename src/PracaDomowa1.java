import java.util.Scanner;

public class PracaDomowa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();
        System.out.println("Wybrane przez Ciebie liczby to: " + firstNumber + " oraz " + secondNumber);

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
    }
}
