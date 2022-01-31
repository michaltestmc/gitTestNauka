// porównują elementy równania i zwracają logiczną wartość (true/false)

import java.util.Scanner;

public class OperatoryPorownania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();
        System.out.println("Wybrane przez Ciebie liczby to: " + firstNumber + " oraz " + secondNumber);

        System.out.println("Pierwsza liczba jest większa niż druga: " + (firstNumber > secondNumber));
        System.out.println(firstNumber < secondNumber);
        System.out.println(firstNumber >= secondNumber);
        System.out.println(firstNumber <= secondNumber);
        System.out.println(firstNumber == secondNumber); // jesli dalibysmy jeden znak = to byloby przypisanie wartosci, a nie porownanie
        System.out.println(firstNumber != secondNumber); // sprawdzenie czy roznia sie
    }
}
