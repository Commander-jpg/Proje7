import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Proje20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Doğum gününüzü gün/ay/yıl formatında girin (örnek: 21/10/2005): ");
        String dogumGunTarihiStr = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dogumGunTarihi = LocalDate.parse(dogumGunTarihiStr, formatter);


        LocalDate bugun = LocalDate.now();


        Period yas = Period.between(dogumGunTarihi, bugun);


        System.out.println("Yaşınız: " + yas.getYears() + " yıl, " + yas.getMonths() + " ay, " + yas.getDays() + " gün.");

        scanner.close();
    }
}
