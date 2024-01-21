import java.util.Scanner;

public class Proje5 {

    public static void main(String[] args) {


        System.out.println("Bir Sayı Giriniz");
        int binler,yuzler,onlar,birler;
        Scanner klavye=new Scanner(System.in);
        int sayi=klavye.nextInt();

        binler=sayi/1000;
        sayi=sayi-(1000*binler);

        yuzler=sayi/100;
        sayi=sayi-(100*yuzler);

        onlar=sayi/10;
        sayi=sayi-(10*onlar);

        birler=sayi;

        System.out.println("Sayının Basamaklarına Ayrılmış Hali " + binler + " " + yuzler + " " + onlar + " " + birler);
        System.out.println("Binler Basamağı : " + binler);
        System.out.println("Yüzler Basamağı : " + yuzler);
        System.out.println("Onlar Basamağı  : " + onlar);
        System.out.println("Birler Basamağı : " + birler);

    }

}