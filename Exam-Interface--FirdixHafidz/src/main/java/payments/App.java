package payments;

public class App {
    public static void main(String[] args) {
        // Membuat objek pembayaran
        CreditCardPayment creditPayment = new CreditCardPayment("1234567812345678");
        PayPalPayment paypalPayment = new PayPalPayment("user@example.com");

        // Memproses pembayaran
        creditPayment.processPayment(696969.69);
        System.out.println();
        paypalPayment.processPayment(42.0);

        // Credit
        System.out.println("");
        System.out.println("\uD835\uDC6A\uD835\uDC93\uD835\uDC86\uD835\uDC82\uD835\uDC95\uD835\uDC86\uD835\uDC85 \uD835\uDC8A\uD835\uDC8F \uD835\uDC84\uD835\uDC90\uD835\uDC8D\uD835\uDC8D\uD835\uDC82\uD835\uDC83\uD835\uDC90\uD835\uDC93\uD835\uDC82\uD835\uDC95\uD835\uDC8A\uD835\uDC90\uD835\uDC8F \uD835\uDC83\uD835\uDC86\uD835\uDC95\uD835\uDC98\uD835\uDC86\uD835\uDC86\uD835\uDC8F \uD835\uDC6F\uD835\uDC82\uD835\uDC87\uD835\uDC8A\uD835\uDC85\uD835\uDC9B \uD835\uDC77\uD835\uDC96\uD835\uDC95\uD835\uDC93\uD835\uDC82 \uD835\uDC79\uD835\uDC82\uD835\uDC84\uD835\uDC89\uD835\uDC8E\uD835\uDC82\uD835\uDC8F & \uD835\uDC74\uD835\uDC96\uD835\uDC89\uD835\uDC82\uD835\uDC8E\uD835\uDC8E\uD835\uDC82\uD835\uDC85 \uD835\uDC68\uD835\uDC8D\uD835\uDC82\uD835\uDC8E \uD835\uDC6D\uD835\uDC8A\uD835\uDC93\uD835\uDC85\uD835\uDC82\uD835\uDC96\uD835\uDC94");

    }
}
