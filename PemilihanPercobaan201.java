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
        // System.out.printf("Nilai Akhir : %.2f Maka Anda %s \n",total, message);   

        float total = (uas*0.4F) + (uts*0.3F) + (quiz*0.1F) + (tugas*0.2F);
        String message = total < 65 ? "Remedi" : "Tidak Remedi";
        if (total > 80 && total <= 100) {
            System.out.printf("Nilai Akhir : %.2f Maka Anda %s \n",total, message);   
            System.out.println("Nilai Huruf A ");
            System.out.println("Nilai Angka 4 ");
            System.out.println("Sangat Baik");
        } else if(total > 73 && total <= 80) {
            System.out.printf("Nilai Akhir : %.2f Maka Anda %s \n",total, message);   
            System.out.println("Nilai Huruf B+ ");
            System.out.println("Nilai Angka 3.5 ");
            System.out.println("Lebih Dari Baik");
        }else if(total > 65 && total <= 73){
            System.out.printf("Nilai Akhir : %.2f Maka Anda %s \n",total, message);   
            System.out.println("Nilai Huruf B ");
            System.out.println("Nilai Angka 3 ");
            System.out.println("Baik");
        }else if(total > 60 && total <= 65){
            System.out.printf("Nilai Akhir : %.2f Maka Anda %s \n",total, message);    
            System.out.println("Nilai Huruf C+ ");
            System.out.println("Nilai Angka 2 ");
            System.out.println("Lebih Dari Cukup");
        }else if(total > 50 && total <= 60){
            System.out.printf("Nilai Akhir : %.2f Maka Anda %s \n",total, message);   
            System.out.println("Nilai Huruf C ");
            System.out.println("Nilai Angka 2 ");
            System.out.println("Cukup");
        }else if (total > 39 && total <= 50) {
            System.out.println("Nilai Huruf D ");
            System.out.println("Nilai Angka 1 ");
            System.out.println("Kurang");
            System.out.printf("Nilai Akhir : %.2f Maka Anda %s \n",total, message);   
        }else if (total <= 39 && total > 0 ) {
            System.out.printf("Nilai Akhir : %.2f Maka Anda %s \n",total, message);   
            System.out.println("E ");
            System.out.println("Nilai Angka 0 ");
            System.out.println("Gagal");
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