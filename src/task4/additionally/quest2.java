package task4.additionally;

/**
 * ●	Необходимо вывести на консоль такую последовательность чисел:
 * ○	1 2 4 8 16 32 64 128 256 512
 */
public class quest2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }
}
