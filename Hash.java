import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hash {
     private static Map<String, String> genreAPI = Map.of("Caifanes", "Rock", "Michael Jackson", "Pop", "Queen", "Rock");



public static void main(String[] args) {
try {
            Map<String, Integer> hashTable = new HashMap<>();
            BufferedReader br = new BufferedReader(new FileReader("entrada_hash.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                int year = Integer.parseInt(parts[1]);
                if (year < 1970) continue;  // Filtro único
                hashTable.put(parts[0], year);
            }
             br.close();
            List<String> sortedKeys = new ArrayList<>(hashTable.keySet());
            Collections.sort(sortedKeys);
            BufferedWriter bw = new BufferedWriter(new FileWriter("salida_hash.txt"));
            int total = 0, avg = 0;
            for (String key : sortedKeys) {
                String genre = genreAPI.getOrDefault(key, "Desconocido");
                bw.write(key + ":" + hashTable.get(key) + " (" + genre + ")\n");
                total++;
                avg += hashTable.get(key);
            }
              avg /= total;
            bw.write("\nTotal: " + total + ", Promedio: " + avg);
            bw.close();
            System.out.println("Hash completado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
}