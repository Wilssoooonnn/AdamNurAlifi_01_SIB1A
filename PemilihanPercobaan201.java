import java.util.Scanner;
/**
 * PemilihanPercobaan101
 */
public class PemilihanPercobaan201 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        System.out.print("Nilai UAS : ");
        float uas = input01.nextFloat();
        System.out.print("Nilai UTS : ");
        float uts = input01.nextFloat();
        System.out.print("Nilai QUIZ : ");
        float quiz = input01.nextFloat();
        System.out.print("Nilai TUGAS : ");
        float tugas = input01.nextFloat();

        float total = (uas*0.4F) + (uts*0.3F) + (quiz*0.1F) + (tugas*0.2F);
        String message = total < 65 ? "Remedi" : "Tidak Remedi";
        System.out.printf("Nilai Akhir : %.2f Maka Anda %s ",total, message);
    }
    
}
// if (angka % 2 == 0) {
//     System.out.printf("Angka %d bilangan Genap",angka);
// } else {
//     System.out.printf("Angka %d bilangan Ganjil",angka);
// }