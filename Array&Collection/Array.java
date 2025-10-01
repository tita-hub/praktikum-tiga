public class Array {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array
        String[] nama = {"Tita", "Ican", "Widia"};
        
        // Akses elemen array
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Nama ke-" + (i+1) + ": " + nama[i]);
        }
    }
}
