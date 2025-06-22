/*  Nama File   : EkspresiLambdaMap.java
    Nama        : Muhammad Affan Firdaus
    NIM         : 24060123140209
*/

import java.util.HashMap;
import java.util.Map;

public class EkspresiLambdaMap {
    public static void main(String[] args) {
        // Membuat Map dengan NIM sebagai key dan nama mahasiswa sebagai value
        Map<String, String> mahasiswa = new HashMap<>();

        // Menambahkan data
        mahasiswa.put("23105101", "Ahmad");
        mahasiswa.put("23105102", "Budi");
        mahasiswa.put("23105103", "Citra");
        mahasiswa.put("23105104", "Dewi");

        // Menampilkan isi Map menggunakan ekspresi lambda
        mahasiswa.forEach((nim, nama) -> 
            System.out.println("NIM: " + nim + ", Nama: " + nama)
        );
    }
}
