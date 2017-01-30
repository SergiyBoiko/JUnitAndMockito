import workingWithFile.CrawlURL;
import workingWithFile.ReadFromFile;
import workingWithFile.WriteToFile;

import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){
        Processes processes = new Processes();
        processes.run(new ReadFromFile(), new WriteToFile(), new CrawlURL(), Executors.newFixedThreadPool(15));
    }
}
