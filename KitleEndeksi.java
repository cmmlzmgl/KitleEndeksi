import java.util.Scanner;

public class KitleEndeksi {
    public static void main(String[] args) {

        double boy;
        int kilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Kişinin Boyunu M Cinsinden Giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen Kişinin Kilosunu Kg Cinsinden Giriniz: ");
        kilo = input.nextInt();

        double endeks = kilo / (boy * boy);

        System.out.print("Girmiş Olduğunuz Değerlere Göre Endeks: "+ endeks);

    }
}
