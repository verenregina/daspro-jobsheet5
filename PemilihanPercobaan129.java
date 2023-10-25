import java.util.Scanner;
public class PemilihanPercobaan129 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        int angka = input29.nextInt();

        String hasil = (angka % 2 == 0) ? "Angka" + angka + " termasuk bilangan genap " : " Angka " + angka + " termasuk bilangan ganjil ";
        System.out.println(hasil);
        
    }
}