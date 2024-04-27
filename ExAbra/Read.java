package ExAbra;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Read {
    public List<String> read(String txt){
        try (BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream(txt)))) {
            List<String> text=new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                text.add(line);
            }
            return text;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
