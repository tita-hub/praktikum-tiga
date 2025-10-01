public class TestThrowAndThrows {
    
    static void cekUmur(int umur) throws Exception {
        if (umur < 18) {
            throw new Exception("Umur harus >= 18");
        }
        System.out.println("Umur valid: " + umur);
    }

    public static void main(String[] args) {
        try {
            cekUmur(15);
        } catch (Exception e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }
}
