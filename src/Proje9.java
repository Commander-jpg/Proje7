import java.util.Scanner;

public class Proje9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir decimal sayı giriniz: ");
        int decimalNumber = scanner.nextInt();

        String binaryString = Integer.toBinaryString(decimalNumber);

        System.out.println("Binary karşılığı: " + binaryString);
    }
}
