import java.util.Scanner;

public class deretFor {
    public static void main(String[] args) {
        int beda, n, a, isi;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan suku awal : ");
        a = input.nextInt();
        System.out.println("Masukkan beda : ");
        beda = input.nextInt();
        System.out.println("Masukkan jumlah suku : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            isi = a + ((i - 1) * beda);

            System.out.println("Suku ke - " + i + " bernilai : " + isi);
        }
    }
}
