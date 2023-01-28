import java.util.Scanner;
public class ort {
    public static void main(String[] args){
        int mat,fizik,kimya,muzik,turkce;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz giriniz : ");
        mat = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = inp.nextInt();

        double avarage = (mat + turkce + kimya + fizik + muzik) / 5;

        if(mat > 100 || turkce > 100 || kimya > 100 || fizik > 100 || muzik > 100) {
        System.out.println("Notunuz 100 ü geçmemelidir. Tekrar deneyiniz.");
        }

        else if (avarage <= 55){
            System.out.println("Sınıfta Kaldınız.");
            System.out.println("Ortalamanız : " + avarage);
        }
        else {
            System.out.println("Tebrikler!! Sınıfı Geçtiniz.");
            System.out.println("Ortalamanız : " + avarage);
        }
     }
}
