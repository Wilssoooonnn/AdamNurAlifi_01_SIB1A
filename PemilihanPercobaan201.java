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
        // String message = total < 65 ? "Remedi" : "Tidak Remedi";
        // System.out.printf("Nilai Akhir : %.2f Maka Anda %s ",total, message);   
        if (total > 80 && total <= 100) {
            System.out.print("A ");
            System.out.print("Nilai 4 ");
            System.out.print("Sangat Baik");
        } else if(total > 73 && total <= 80) {
            System.out.print("B+ ");
            System.out.print("Nilai 3.5 ");
            System.out.print("Lebih Dari Baik");
        }else if(total > 65 && total <= 73){
            System.out.print("B ");
            System.out.print("Nilai 3 ");
            System.out.print("Baik");
        }else if(total > 60 && total <= 65){
            System.out.print("C+ ");
            System.out.print("Nilai 2 ");
            System.out.print("Lebih Dari Cukup"); 
        }else if(total > 50 && total <= 60){
            System.out.print("C ");
            System.out.print("Nilai 2 ");
            System.out.print("Cukup");
        }else if (total > 39 && total <= 50) {
            System.out.print("D ");
            System.out.print("Nilai 1 ");
            System.out.print("Kurang");
        }else if (total <= 39 && total > 0 ) {
            System.out.print("D ");
            System.out.print("Nilai 0 ");
            System.out.print("Gagal");
        }else{
            System.out.print("Terjadi Kesalahan");
        }
    }
    
}
// if (angka % 2 == 0) {
//     System.out.printf("Angka %d bilangan Genap",angka);
// } else {
//     System.out.printf("Angka %d bilangan Ganjil",angka);
// }