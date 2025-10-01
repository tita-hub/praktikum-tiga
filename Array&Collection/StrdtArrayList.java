import java.util.ArrayList;

public class StrdtArrayList {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();

        daftarNama.add("Tita");
        daftarNama.add("Ardi");
        daftarNama.add("Rina");

        daftarNama.remove("Ardi");

        for (String nama : daftarNama) {
            System.out.println(nama);
        }
    }
}
