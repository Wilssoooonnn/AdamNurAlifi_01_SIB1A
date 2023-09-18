import java.util.Scanner;

public class Gaji01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int jmlMasuk, jmlhTdkMasuk, totGaji;
        int gaji, potGaji;

        System.out.print("Masukkan Gaji Perhari : ");
        gaji = input.nextInt();
        System.out.print("Masukkan Potongan Gaji Harian : ");
        potGaji = input.nextInt();
        System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda : ");
        jmlMasuk = input.nextInt();
        System.out.print("Masukkan Jumlah Hari Tidak Masuk Kerja Anda : ");
        jmlhTdkMasuk = input.nextInt();

        totGaji = (jmlMasuk*gaji)-(jmlhTdkMasuk*potGaji);
        
        System.out.println("Gaji yang anda terima adalah : "+totGaji );
    }
}
