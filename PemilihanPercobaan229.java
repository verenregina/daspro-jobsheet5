import java.util.Scanner;
public class PemilihanPercobaan229 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float uas = input29.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input29.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input29.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input29.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);

        System.out.print("Nilai anda dirapot adalah ");
        if (total > 80) {
            System.out.print("A");
        } else if (total > 73) {
            System.out.print("B+");
        } else if (total > 65) {
            System.out.print("B");
        } else if (total > 60) {
            System.out.print("C+");
        } else if (total > 50) {
            System.out.print("C");
        } else if (total > 39) {
            System.out.print("D");
        } else {
            System.out.print("E");
        }
        
    }
}