// dzialaja na wartosciach logicznych zwracajac rowniez wartosci logiczne

public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && - operator "i", zwraca true jesli wyrazenia skladowe sa rowne true
        System.out.println(firstValue && secondValue); // false, bo co najmniej jedna z nich nie ma true
        System.out.println(firstValue && fourthValue); // true, bo oba sa true

        // || "lub", zwraca true jesli jedno wyrazenie skladowe jest rowne true
        System.out.println(firstValue || secondValue); // true, bo co najmniej jedna z nich jest true

        // ! "negacja", zwraca wartosc przeciwna do wyrazenia przed ktorym sie znajduje
        System.out.println(!firstValue); // false
        System.out.println(!(firstValue && thirdValue)); // true
    }
}
