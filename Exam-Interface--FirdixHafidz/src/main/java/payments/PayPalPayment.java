package payments;

// PayPalPayment mengimplementasikan interface Payment
public class PayPalPayment implements Payment {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("🅿️ Memproses pembayaran dengan PayPal...");
        System.out.println("✅ Pembayaran sebesar $" + amount + " berhasil dengan akun PayPal: " + email);
    }
}
