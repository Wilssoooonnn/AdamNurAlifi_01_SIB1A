import java.util.Scanner;
/**
 * PemilihanPercobaan101
 */
public class PemilihanPercobaan101_Modifikasi {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        int angka = input01.nextInt();

        String hasil;
        hasil = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.printf("%d adalah %s",angka, hasil);
    }
    
}
// if (angka % 2 == 0) {
//     System.out.printf("Angka %d bilangan Genap",angka);
// } else {
//     System.out.printf("Angka %d bilangan Ganjil",angka);
// }