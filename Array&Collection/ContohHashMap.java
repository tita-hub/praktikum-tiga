import java.util.HashMap;

public class ContohHashMap {
    public static void main(String[] args) {
        HashMap<String, String> mahasiswa = new HashMap<>();

        mahasiswa.put("A01", "Tita");
        mahasiswa.put("A02", "Alya");
        mahasiswa.put("A03", "Alikha");

        System.out.println("Nama A02: " + mahasiswa.get("A02"));

        for (String key : mahasiswa.keySet()) {
            System.out.println(key + " -> " + mahasiswa.get(key));
        }
    }
}
