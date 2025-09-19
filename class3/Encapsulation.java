// class Main{
//     public static void main(String args[]){
//         System.out.println("Opps");
//     }
// }

//Encapsulation ->
public class Encapsulation {

    private double balance;

    public void showBalance() {
        System.out.println("The current balance is " + balance);
    }

    public void withdrowAmount(double money) {
        balance = balance - money;
    }

    public void depositAmount(double money) {
        balance = balance + money;
    }

    public static void main(String[] args) {
        Encapsulation E = new Encapsulation();
        E.showBalance();
        E.depositAmount(10000);
        E.showBalance();
        E.withdrowAmount(233.10);
        E.showBalance();
    }
}


