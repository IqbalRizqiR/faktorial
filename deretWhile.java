import java.util.Scanner;

public class deretWhile {
    public static void main(String[] args) {
        int beda, n, a, isi, i = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan suku awal : ");
        a = input.nextInt();
        System.out.println("Masukkan beda : ");
        beda = input.nextInt();
        System.out.println("Masukkan jumlah suku : ");
        n = input.nextInt();

        while (i <= n) {
            isi = a + ((i - 1) * beda);

            System.out.println("Suku ke - " + i + " bernilai : " + isi);

            i++;
        }
    }
}
