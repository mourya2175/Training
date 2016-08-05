package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class First {
  @Test
  public void f() {
	  System.out.println("My First Maven Project");
  
System.out.println("added new line");
 }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
