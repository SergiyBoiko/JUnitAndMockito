import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunMain {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(ReadFromFileTest.class,CrawlURLTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("All test are successful - "+result.wasSuccessful());
	}

}
