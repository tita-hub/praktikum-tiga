public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int hasil = 10 / 0;
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        } finally {
            System.out.println("Blok finally selalu dijalankan.");
        }
    }
}
