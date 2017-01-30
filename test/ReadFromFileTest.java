import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

import workingWithFile.ReadFromFile;

public class ReadFromFileTest {
	private ReadFromFile readFromFile = new ReadFromFile();
	private final String testFileDir = "resource\\testresource\\fileTest.txt";
	private List<String> testListTrue;
	private List<String> testListFalse;
	
	@Before
	public void initialList(){
		testListTrue = new ArrayList<>();
		testListTrue.add("https://www.google.ru/");
		testListFalse = new ArrayList<>();
		testListFalse.add("test");
		testListFalse.add("test");
		
	}
	
	@Test
	public void testGetLinksFromFileEquals() {
		assertEquals(testListTrue, new ReadFromFile().getLinksFromFile(testFileDir));	
	}

	@Test
	public void testGetLinksFromFileNotEquals(){
		assertNotEquals(testListFalse, new ReadFromFile().getLinksFromFile(testFileDir));
	}

	@Test 
	public void testGetLinksFromFileEqualsMocito(){
		ReadFromFile mockedReadFromFile = Mockito.mock(ReadFromFile.class);
		when(mockedReadFromFile.getLinksFromFile(testFileDir)).thenReturn(readFromFile.getLinksFromFile(testFileDir));
		assertEquals(testListTrue, mockedReadFromFile.getLinksFromFile(testFileDir));
	}

}
