import org.apache.commons.codec.digest.DigestUtils;
import workingWithFile.CrawlURL;
import workingWithFile.ReadFromFile;
import workingWithFile.WriteToFile;

import java.util.concurrent.ExecutorService;

public class Processes {
	private final String FILE_NAME_OUT = "resource\\MD5Hash.txt";
	private final String FILE_NAME_INP = "resource\\fileLinks.txt";
    public void run(ReadFromFile readFromFile, WriteToFile writeToFile, CrawlURL crawlURL, ExecutorService executor){
        readFromFile.getLinksFromFile(FILE_NAME_INP).forEach((link) -> {
            executor.execute(() -> {
                writeToFile.cleanResources(FILE_NAME_OUT);
                String content = crawlURL.getContentByLink(link);
                String hash = DigestUtils.md5Hex(content);
                writeToFile.writeMD5HashToFile(hash, FILE_NAME_OUT);
            });
        });
        executor.shutdown();
    }
}
