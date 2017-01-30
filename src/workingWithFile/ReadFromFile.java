package workingWithFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {
	public double div(double a, double b) {
		return a/b;
	}
    public List<String> getLinksFromFile(String nameFile) {
        List<String> listLinks = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(nameFile), "Cp1251"))){
            String str;
            while((str = br.readLine()) != null){
                listLinks.add(str);
            }
            throw new FileNotFoundException();
        }
        catch (UnsupportedEncodingException | FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listLinks;
    }
}
