import static org.junit.Assert.*;

import org.junit.Test;

import workingWithFile.CrawlURL;

public class CrawlURLTest {

	@Test
	public void testGetContentByLink() {
		assertNotEquals("https://www.google.ru/", new CrawlURL().getContentByLink("https://www.google.ru/"));
	}

}
