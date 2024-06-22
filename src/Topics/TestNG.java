package Topics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
@BeforeMethod
  public void first() {
	System.out.println("first");
  }
@Test
public void second() {
	System.out.println("Second");
}
@AfterMethod
public void third() {
	System.out.println("Third");
}
}
