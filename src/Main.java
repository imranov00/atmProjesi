import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String userName;
        String password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right>0){
            Scanner inp = new Scanner(System.in);

            System.out.print("Kullanıcı Adını Giriniz:");
            userName= inp.nextLine();

            System.out.print("Şifrenizi Giriniz: ");
            password= inp.nextLine();
            if (userName.equals("patika") && password.equals("dev123")){
                do {
                    System.out.println("Sisteme Giriş Yapıldı. ");
                    System.out.println("1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Çıkış Yap.\n");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz: ");
                    select =inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            int price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            int tutar = inp.nextInt();
                            if (tutar > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= tutar;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                        default:
                            System.out.println("Geçersiz seçim. Lütfen tekrar deneyiniz.");
                    }

                }while (select != 4);
            System.out.println("Tekrar Görüşmek Üzere. :)");
                break;

            }else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre. Tekrar Deneyiniz. ");
                if (right == 0){
                    System.out.println("Hesabınız Bloke Olmuştur.Lütfen Banka İle İletişime Geçiniz. ");
                }
                System.out.println("Kalan Hakkınız : " + right);

            }

        }







    }
}