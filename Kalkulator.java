import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Kalkulator Sederhana");
            System.out.println("Pilih operasi:");
            System.out.println("1. Penjumlahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (*)");
            System.out.println("4. Pembagian (/)");
            System.out.println("0. Keluar");

            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = input.nextInt();

            if (pilihan == 0) {
                System.out.println("Terima kasih telah menggunakan kalkulator sederhana.");
                break;
            }

            if (pilihan < 1 || pilihan > 4) {
                System.out.println("Pilihan tidak valid. Silakan pilih angka dari 1 hingga 4.");
                continue;
            }

            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            double hasil = 0;
            switch (pilihan) {
                case 1:
                    hasil = angka1 + angka2;
                    break;
                case 2:
                    hasil = angka1 - angka2;
                    break;
                case 3:
                    hasil = angka1 * angka2;
                    break;
                case 4:
                    if (angka2 == 0) {
                        System.out.println("Pembagian oleh nol tidak diperbolehkan.");
                        continue;
                    }
                    hasil = angka1 / angka2;
                    break;
            }

            System.out.println("Hasil: " + hasil);
        }

        input.close();
    }
}
