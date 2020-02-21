package Utils;

import java.io.*;

public class DataReader {
    public void FileReader () throws IOException {
        try {
            File dataFile = new File("src/test/resources/data.txt");
            BufferedReader reader = new BufferedReader(new FileReader(dataFile));
            String data;
            while ((data = reader.readLine()) != null)
                System.out.println(data);
        }
        catch (FileNotFoundException exception){
            System.out.println("File not found");

        }
    }
}