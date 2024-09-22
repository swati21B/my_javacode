package java_Code;
import java.util.FormatterClosedException;

public class ThrowThrows {

	public static void main(String[] args) throws FormatterClosedException, InterruptedException
	{
	System.out.println("Hello");
	Thread.sleep(5000);
	System.out.println("Bye");
	throw new InterruptedException();	

	}

}
