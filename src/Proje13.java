
import java.util.Scanner;
public class Proje13 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Üçgenin birinci kenarını giriniz: ");
        double k1=oku.nextDouble();
        System.out.print("Üçgenin ikinci kenarını giriniz: ");
        double k2=oku.nextDouble();
        System.out.print("Üçgenin üçüncü kenarını giriniz: ");
        double k3=oku.nextDouble();
        double u=(k1+k2+k3)/2;
        double alan=Math.sqrt(u*(u-k1)*(u-k2)*(u-k3));
        double cevre=k1+k2+k3;
        System.out.println("Üçgenin Alanı: "+alan+"\nÜçgenin Çevresi: "+cevre);
    }
}