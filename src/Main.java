import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kayitKullanici, kayitSifre, kullaniciAdi, sifre, yeniSifre;
        int sifirlama;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kayıt için kullanıcı adınızı giriniz : ");
        kayitKullanici = inp.nextLine();
        System.out.println("Kayıt için şifrenizi giriniz : ");
        kayitSifre = inp.nextLine();
        System.out.println("Kullanıcı adı ve şifreniz başarıyla oluşturuldu. ");

        System.out.println("Giriş yapmak istediğiniz hesabın kullanıcı adını giriniz : ");
        kullaniciAdi = inp.nextLine();
        System.out.println("Giriş yapmak istediğiniz hesabın şifresini giriniz : ");
        sifre = inp.nextLine();

        if (kayitSifre.equals(sifre)) {
            System.out.println("Başarıyla giriş yaptınız!");
        } else {
            System.out.println("Bilgileriniz yanlış ! ");
            System.out.println("Yapmak istediğiniz işlemi seçiniz :  ");
            System.out.println("1-Şifre Sıfırlama\n2-Çıkış");
            sifirlama = inp.nextInt();

            switch (sifirlama) {
                case 1:
                    Scanner inp1 = new Scanner((System.in));
                    System.out.println("Lütfen yeni şifrenizi girin : ");
                    yeniSifre = inp1.nextLine();
                    if (kayitSifre.equals(yeniSifre)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        yeniSifre = inp1.nextLine();
                        System.out.println("Yeni şifreniz başarıyla oluşturuldu! ");
                    } else {
                        System.out.println("Şifreniz başarıyla oluşturuldu!");
                    }
                    break;
                case 2:
                    System.out.println("Çıkış yapılıyor.");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız.");
            }

        }


    }
}