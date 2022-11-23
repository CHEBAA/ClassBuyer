import java.util.Comparator;

public class Buyer {
    private String firstname;
    private String lastname;
    private String name;
    private String adress;
    private int creditNumber;
    private long bankAccountNumber;
    // Конструктор
    Buyer ( String lastname, String firstname, String name, String adress, int creditNumber, long bankAccountNumber){
        this.firstname=firstname;
        this.lastname=lastname;
        this.name=name;
        this.adress=adress;
        this.creditNumber=creditNumber;
        this.bankAccountNumber=bankAccountNumber;
    }
//установка значений атрибутов
    void setFirstname(String firstname){
        this.firstname=firstname;
    }

    void setLastname(String lastname) { this.lastname=lastname;}

    void setName(String name) {this.name=name;}

    void setAdress(String adress) {this.adress=adress;}

    void setCreditNumber(int creditNumber) {this.creditNumber=creditNumber;}

    void setBankAccountNumber(long bankAccountNumber) {this.bankAccountNumber=bankAccountNumber;}
//получение значений атрибутов
    String getFirstname(){return firstname;}

    String getLastname(){return lastname;}

    String getName(){return name;}

    String getAdress(){return  adress;}

    int getCreditNumber(){return  creditNumber;}

    long getBankAccountNumber(){return  bankAccountNumber;}
    // вывод информации
    String printBuyer() {
    return " name: " + lastname + " " + firstname + " " + name + ", adress: " + adress + ", credit number: " +
            creditNumber + ", bank account number " +  bankAccountNumber;
    }
    boolean rav(Object o) {
       if(this == o)
           return true;
       if(o != null && this.getClass()!=o.getClass())
           return false;
        Buyer buyer = (Buyer) o;
        return this.name.equals(buyer.getName());
    }


    public int compare(Buyer o2) {
        String nameBuyer1 = this.name.toUpperCase();
        String nameBuyer2 = o2.getName().toUpperCase();

        return nameBuyer1.compareTo(nameBuyer2);
    }


}
