package Week2.Exercises.Practices.BankingSystem;

import java.util.Scanner;

public class BankingSystem {

    private static Customer[] customers = new Customer[10];

    public static void main(String[] args) {
        Customer customer = new Customer("eda", "başak", "eda12345678", "11111111111", "121212");
        customers[0] = customer;
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        validatedPassword();

        int choice;
        while (true) {
            System.out.println("\n-----BANKACILIK İŞLEMLERİ-----");
            System.out.println("1 - Yeni Hesap Aç");
            System.out.println("2 - Hesaplarını Listele (Yapılmadı)");
            System.out.println("3 - Hesap Seç ve İşlem Yap (Yapılmadı)");
            System.out.println("4 - Çıkış Yap");
            System.out.print("Seçiminizi yapınız: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Başlangıç bakiyesi giriniz: ");
                    double amount = scanner.nextDouble();

                    System.out.println("Para birimi seçiniz: 1 - TL  /  2 - $  / 3 - €  / 4 - ALTIN ");
                    int currencyChoice = scanner.nextInt();
                    CurrencyType currencyType;

                    switch (currencyChoice) {
                        case 1: currencyType = CurrencyType.TL; break;
                        case 2: currencyType = CurrencyType.DOLAR; break;
                        case 3: currencyType = CurrencyType.EURO; break;
                        case 4: currencyType = CurrencyType.GOLD; break;
                        default:
                            System.out.println("Geçersiz para birimi seçimi");
                            continue;
                    }

                    String customerName = customers[0].getName();
                    String accountNumber = customerName.charAt(0) + "" + customerName.length() + currencyChoice;
                    BankAccount bankAccount = new BankAccount(accountNumber, amount, currencyType);

                    System.out.println("Hesap başarıyla oluşturuldu! Hesap No: " + accountNumber);
                    break;

                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    return;

                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }

    private static void validatedPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Merhaba, " + customers[0].getName());
        int wrongPasswordCounter = 0;

        do {
            System.out.print("Şifrenizi giriniz: ");
            String password = scanner.nextLine();

            if (customers[0].getPassword().equals(password)) {
                System.out.println("Giriş başarılı.");
                break;
            } else {
                System.out.println("Yanlış şifre girdiniz.");
                wrongPasswordCounter++;
            }

        } while (wrongPasswordCounter < 4);

        if (wrongPasswordCounter == 4) {
            System.out.println("Hesap bloke edildi. Program sonlandırılıyor.");
            System.exit(0);
        }
    }
}
