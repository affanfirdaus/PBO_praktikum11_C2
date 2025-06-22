/*  Nama File   : EkspresiLambdaMap.java
    Nama        : Muhammad Affan Firdaus
    NIM         : 24060123140209
*/

import java.util.HashMap;
import java.util.Map;

public class EkspresiLambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswa = new HashMap<>();

        mahasiswa.put("23105101", "Ahmad");
        mahasiswa.put("23105102", "Budi");
        mahasiswa.put("23105103", "Citra");
        mahasiswa.put("23105104", "Dewi");
        
        mahasiswa.forEach((nim, nama) -> 
            System.out.println("NIM: " + nim + ", Nama: " + nama)
        );
    }
}
