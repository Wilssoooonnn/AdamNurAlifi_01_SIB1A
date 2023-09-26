import java.util.Scanner;
/**
 * PemilihanPercobaan101
 */
public class PemilihanPercobaan101 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        int angka = input01.nextInt();

        if (angka % 2 == 0) {
            System.out.print("angka " +angka+ " bilangan genap");
        } else {
            System.out.print("angka " +angka+ " bilangan ganjil");
        }
    }
    
}
// if (angka % 2 == 0) {
//     System.out.printf("Angka %d bilangan Genap",angka);
// } else {
//     System.out.printf("Angka %d bilangan Ganjil",angka);
// }