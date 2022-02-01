import java.util.Scanner;

public class PracaDomowa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int number = scanner.nextInt();
        if (number >= 18) {
            System.out.println("Możesz kupić alkohol");
        } else System.out.println("Nie sprzedam Ci alkoholu");
    }
}
