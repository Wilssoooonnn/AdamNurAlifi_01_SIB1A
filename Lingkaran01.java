import java.util.Scanner;

public class Lingkaran01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r;
        double luas, keliling;
        double phi = 3.14;

        System.out.print("Masukkan jari-jari : ");
        r = input.nextInt();

        keliling = 2*phi*r;
        luas = phi*r*r;
        
        System.out.printf("Keliling Lingkaran : %f dan Luas Lingkaran : %f",keliling,luas);
    }
}
