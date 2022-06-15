package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
   @Test
  public void method1() 
   {
	Reporter.log("method1 ");
   }
   @Test
   public void method2() 
    {
	   Reporter.log("method2 ");
    }
   @Test
   public void method3() 
    {
	   Reporter.log("method3 ");
    }
   @Test
   public void method4() 
    {
	   Reporter.log("method4 ");  
    }
   @Test
   public void method5() 
    {
	   Reporter.log("method5 ");
    }
}
