import java.util.Scanner;

public class TugasKelompokJobsheet5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username = "a";
        String password = "b";

        System.out.print("Masukkan Username : ");
        String UserID = input.nextLine();
        System.out.print("Masukkan Password : ");
        String UserPW = input.nextLine();

        if (UserID.equals(username) && UserPW.equals(password)) {
            while (true) {
                System.out.println("1. Input Barang");
                System.out.println("2. Hapus Barang");
                System.out.print("Pilih Menu : ");
                int pilih = input.nextInt();

                switch (pilih) {
                    case 1:
                        String namaBarang;
                        int jmlBarang, harga, totalHarga;
                        char inginInputLagi;
                        do {
                            System.out.print("Masukkan Nama Barang: ");
                            namaBarang = input.next();

                            System.out.print("Masukkan Jumlah Barang: ");
                            jmlBarang = input.nextInt();

                            System.out.print("Masukkan Harga Barang: ");
                            harga = input.nextInt();

                            totalHarga = jmlBarang * harga;
                            System.out.println("Total Harga: " + totalHarga);

                            System.out.println("Barang Telah Berhasil di-Input");

                            System.out.print("Ingin menginput lagi? (Y/N): ");
                            inginInputLagi = input.next().charAt(0);

                        } while (inginInputLagi == 'Y' || inginInputLagi == 'y');
                        break;
                    case 2:
                        // String namaBarang;
                        // int jmlBarang, harga, totalHarga;
                        // char inginInputLagi;
                        do {
                            System.out.print("Masukkan Nama Barang Yang Ingin Dihapus : ");
                            namaBarang = input.next();

                            System.out.println("Barang Berhasil di-Hapus !");

                            System.out.print("Ingin menginput lagi? (Y/N): ");
                            inginInputLagi = input.next().charAt(0);

                        } while (inginInputLagi == 'Y' || inginInputLagi == 'y');
                        break;
                    default:
                    System.out.println("Program Selesai");
                        break;
                }

            }
        } else {
            System.out.println("Login Tidak Berhasil");
        }

    }
}
