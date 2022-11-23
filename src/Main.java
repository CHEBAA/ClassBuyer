import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество покупателей:");
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Buyer> list = new ArrayList<Buyer>();
       for(int i=0;i<n;i++){
            System.out.println("Введите данные покупателя номер: " + i+1);

            System.out.println("Фамилия");
            String lastname =in.nextLine();

            System.out.println("Имя");
            String name =in.nextLine();

            System.out.println("Отчество");
            String firstname =in.nextLine();

            System.out.println("Адрес");
            String adress =in.nextLine();

            System.out.println("Номер кредитной карты");
            int creditNumber = Integer.parseInt(in.nextLine());

            System.out.println("Номер счета");
            long bankAccountNumber =Long.parseLong(in.nextLine());

            Buyer p1 = new Buyer(  lastname, firstname,  name,  adress,  creditNumber,  bankAccountNumber);
        list.add(p1);
        }
        list.forEach(hyi -> System.out.println(hyi.printBuyer()));
        System.out.println("__________________________");
        list.forEach(buyer -> {
            if (buyer.getBankAccountNumber()>3000 && buyer.getBankAccountNumber()<7000){
                System.out.println(buyer.printBuyer());
            }
        });
        Collections.sort(
                list,
                new Comparator<Buyer>() {
                    public int compare(final Buyer e1, final Buyer e2) {
                        return e1.getName().compareTo(e2.getName());
                    }
                }
        );
System.out.println("__");
      /*  Buyer p1 = new Buyer(  "hdhdhd", "grrgrdr",  "sdv",  "svvv",  4444444,  555555);
        Buyer p2 = new Buyer(  "vdfvf", "efs",  "bfdbd",  "grrdg",  3333,  8888888);
        p1.rav(p1);
        p1.rav(p2);*/

    }
}
