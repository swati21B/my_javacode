package selenium.TestNG.Programs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_1BM_1AF {
@Test
public void test1()
{
	System.out.println("1");
}
@BeforeMethod
public void test2()
{
	System.out.println("2");
}
@AfterMethod
public void test3()
{
	System.out.println("3");
}

}
