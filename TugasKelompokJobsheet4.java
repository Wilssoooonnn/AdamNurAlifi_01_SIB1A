import java.util.Scanner;
/**
 * TugasKelompokJobsheet4
 */
public class TugasKelompokJobsheet4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String brgMasuk,displayBarang; int jmlBarang;

        System.out.print("Maasukkan Nama Barang : ");
        brgMasuk = input.nextLine();
        System.out.print("Masukkaan Jumlah Barang : ");
        jmlBarang = input.nextInt();

        // displayBarang = brgMasuk+jmlBarang;

        System.out.println("|---------Barang Masuk----------|");
        System.out.println("|Nama Barang  | Jumlah Barang   |");
        System.out.println("|-------------------------------|");
        System.out.printf("|%s            | %d             |\n",brgMasuk,jmlBarang);
        System.out.println("|-------------------------------|");
        
        
    }   
}