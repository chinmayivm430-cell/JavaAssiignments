class Payment {

    double calculateAmount(double amount) {
        return amount;
    }

    // Overloaded method
    double calculateAmount(double amount, double discountPercentage) {
        return amount - (amount * discountPercentage / 100);
    }
}

class CardPayment extends Payment {

    @Override
    double calculateAmount(double amount) {
        double fee = amount * 0.02;
        return amount + fee;
    }
}

class UPIPayment extends Payment {

    @Override
    double calculateAmount(double amount) {
        double fee = amount * 0.01;
        return amount + fee;
    }
}

public class Program13 {
    public static void main(String[] args) {
        Payment payment;

        payment = new CardPayment();
        System.out.println("Card Payment: "
                + payment.calculateAmount(1000));

        payment = new UPIPayment();
        System.out.println("UPI Payment: "
                + payment.calculateAmount(1000));

        Payment normal = new Payment();
        System.out.println("Discounted Amount: "
                + normal.calculateAmount(1000, 10));
    }
}
