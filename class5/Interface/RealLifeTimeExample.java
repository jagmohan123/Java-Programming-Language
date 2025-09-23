
interface paymentToProduct {

    void pay(int amount);
}

class creditPayment implements paymentToProduct {

    @Override
    public void pay(int amount) {
        System.out.println("Payment done by credit card amount of" + amount);
    }
}

class debitPayment implements paymentToProduct {

    @Override
    public void pay(int amount) {
        System.out.println("Payment done by debit card amount of" + amount);
    }
}

class upiPayment implements paymentToProduct {

    @Override
    public void pay(int amount) {
        System.out.println("Payment done by upi amount of" + amount);
    }
}

class RealLifeTimeExample {

    public void use() {
        System.out.println("we are seeing the real example interface");
    }

    public static void main(String[] args) {
        RealLifeTimeExample R1 = new RealLifeTimeExample();
        debitPayment d1 = new debitPayment();
        creditPayment cr1 = new creditPayment();
        upiPayment up1 = new upiPayment();
        d1.pay(10000);
        cr1.pay(80000);
        up1.pay(2000);
        R1.use();
    }
}
