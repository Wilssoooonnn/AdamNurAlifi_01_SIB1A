import java.util.Scanner;

public class hargaBayar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int harga, jumlah, jmlHalBuku;
        String merkBuku;
        double dis, total, bayar,jmlDis;

        System.out.print("Merk buku yang dibeli : ");
        merkBuku = input.nextLine();  
        System.out.print("Jumlah halaman buku yang dibeli : ");
        jmlHalBuku = input.nextInt(); 
        System.out.print("Masukkan harga barang yang dibeli : ");
        harga = input.nextInt();
        System.out.print("Masukkan jumlah barang yang dibeli : ");
        jumlah = input.nextInt();
        System.out.print("Masukkan diskon yang didapatkan : ");
        dis = input.nextDouble();
        
        total = jumlah*harga;
        jmlDis = total*dis;
        bayar = total-jmlDis;


        System.out.println("------------------------------------------");
        System.out.println("Total Harga : "+total);
        System.out.println("Diskon yang ada dapat : "+jmlDis);
        System.out.println("------------------------------------------");
        System.out.print("Jumlah yang harus dibayar : "+bayar);


 
    }
}
