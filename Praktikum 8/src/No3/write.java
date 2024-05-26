package No3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class write {

    public static void main(String[] args) {
        //  membaca file menjadi String dan menulis String ke file menggunakan method Files.writeString( ) dan Files.readString( ).
        try {
            // file yang ingin dibaca/ditulis
            Path file = Paths.get("src/No3/test.txt");
            
            // Contoh teks yang akan ditulis ke dalam file
            String isiFile = "Muhammad Zuhdi";
            
            // Tulis teks ke dalam file
            Files.writeString(file, isiFile);
             
            // Baca Teks dari file
            String data = Files.readString(file);
            System.out.println(data);
        } catch (IOException ex) {
            Logger.getLogger(write.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
