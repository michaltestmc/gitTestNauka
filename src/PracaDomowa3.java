public class PracaDomowa3 {
    public static void main(String[] args) {
     /*   for (int i = 0; i<101; i++)
        if (i%3==0)
            System.out.println("Liczby podzielne przez 3: " + i);
       */
        int[] numbers = new int[] {1,3,5,7,0};

        for (int i=0; i<(numbers.length/2);i++) {
            int temp = numbers[i]; // dla i=0 1 dla i=1 3
            numbers[i] = numbers[numbers.length - 1 - i]; // 4 -> 0
            numbers[numbers.length-1-i] = temp; //1
        }
        for (int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        }
    }

