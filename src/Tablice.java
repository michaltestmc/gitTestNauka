public class Tablice {
    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "Andrzej";
        imiona[1] = "Janusz";
        imiona[2] = "Czesław";

        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);

        int[] lottonumery = new int[] {12,21,33,45,51,62};
        System.out.println(lottonumery[0]);
        System.out.println(lottonumery[1]);
        System.out.println(lottonumery[2]);
        System.out.println(lottonumery[3]);
        System.out.println(lottonumery[4]);
        System.out.println(lottonumery[5]);

        System.out.println("Długość tablicy: " + lottonumery.length);

        for (int i = 0; i<imiona.length; i++) System.out.println(imiona[i]);
        for (int i = 0; i<lottonumery.length; i++) System.out.println(lottonumery[i]);

        }
    }

