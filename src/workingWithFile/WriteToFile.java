package workingWithFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteToFile {
    public void writeMD5HashToFile(String content, String fileNameOut){
        try (BufferedWriter write = new BufferedWriter(new FileWriter(new File(fileNameOut),true))){
            write.write("["+content+"]"+"\n");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void cleanResources(String fileNameOut){
        try {
            Files.deleteIfExists(Paths.get(fileNameOut));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
