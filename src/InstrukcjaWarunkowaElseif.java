public class InstrukcjaWarunkowaElseif {
    public static void main(String[] args) {
        int number = 0;

        if (number == 0) {
            System.out.println("Liczba równa zero");
        } else if (number > 0) {
            System.out.println("Liczba dodatnia");
        } else if (number < -5) {
            System.out.println("Liczba mniejsza od -5");
        } else {
            System.out.println("Żaden warunek nie został spełniony");
        }
    }
}
