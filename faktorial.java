import java.util.Scanner;

/**
 * faktorial
 */
public class faktorial {

    public static void main(String[] args) {
        int totalAngka = 1;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan: ");
        int num = input.nextInt();
        
        for (int i = num; i >= 1; i--) {
            totalAngka *= i;
        }

        System.out.println(totalAngka);
    }
}