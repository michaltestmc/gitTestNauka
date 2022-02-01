// Umożliwia cykliczne wykonywanie ciagu instrukcji okreslona liczbe razy
public class PętlaFor {
    public static void main(String[] args) {

        int number = 60;
        // i - specjalna zmienna sterująca
        for (int i = 10; i < 100; i=i+2) {
            System.out.println(i);
        }
        for (int i = 0; i < 100; i++) {
            if(i%5==0) {
                System.out.println(i);
            }
        }
    }
}
