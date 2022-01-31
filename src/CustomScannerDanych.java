import java.util.Scanner;

public class CustomScannerDanych {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię DZIADU");
        String name = scanner.nextLine();
        System.out.println("Tera podaj swoją ulubioną liczbę");
        int firstNumber = scanner.nextInt();
        int result = firstNumber * firstNumber;
        System.out.println("Cześć " + name + " kwadrat Twojej liczby to " + result);
    }
}
