package payments;

// CreditCardPayment mengimplementasikan interface Payment
public class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("💳 Memproses pembayaran dengan kartu kredit...");
        System.out.println("✅ Pembayaran sebesar $" + amount + " berhasil dengan kartu: " + maskCardNumber());
    }

    // Metode untuk menyembunyikan sebagian nomor kartu
    private String maskCardNumber() {
        return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
    }
}
