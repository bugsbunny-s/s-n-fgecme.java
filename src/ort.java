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

        if((mat >= 0 && mat <= 100) && (turkce >= 0 && turkce <= 100) && (kimya >= 0 && kimya <= 100) && (fizik >= 0 && fizik <= 100) && (muzik >= 0 && muzik <=100)){   
            
            if (avarage <= 55){
                System.out.println("Sınıfta Kaldınız.");
               }
            else {
                System.out.println("Tebrikler!! Sınıfı Geçtiniz.");
                }
                System.out.println("Ortalamanız : " + avarage);
    }
    else{
        System.out.println("Notlarınız 0 ila 100 arasında olmalıdır.");
    }
}
}