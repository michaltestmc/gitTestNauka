import java.util.Scanner;

//pozwala okreslac ktore czesci kodu maja zostac wykonane, gdy zostanie spelniony warunek
public class InstrukcjaWarunkowaIf {

    public static void main(String[] args) {
        float a = 10;
        float b = 12;
        if (b!=0) {
            System.out.println("wynik dzielenia to: " + (a/b));
        }
        if (a!=5) {
            System.out.println("mnożymy a i b: " + (a*b));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int c = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int d = scanner.nextInt();
        System.out.println("Wybrane przez Ciebie liczby to: " + c + " oraz " + d);

        if (c>10) {
            System.out.println("Wybrałeś za dużą liczbę, wybierz w przedziale 1-10");
        }
        else {
            System.out.println("Wynik mnożenia c i d to: " + (c*d));
        }
    }
}
