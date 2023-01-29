package task4.additionally;

/**
 * ●	Необходимо написать программу, которая бы вывела в консоль звездочки вот таким образом, как на картинке ниже.
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class quest4 {
    public static void main(String[] args) {
        int value = 5;
        for (int i = value - 1; i >= 0; i--) {
            for (int j = i; j < value; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
