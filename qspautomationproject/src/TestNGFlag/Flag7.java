package TestNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
  @Test(groups="FUNTIONAL")
  public void ft1 () 
  {
	  Reporter.log("ft1", true);
  }
  @Test(groups="SMOKE")
  public void St1 () 
  {
	  Reporter.log("ft1", true);
  }
  @Test(groups="INTEGRATION")
  public void It1 () 
  {
	  Reporter.log("ft1", true);
  }
  //.....................
  
  @Test(groups="FUNTIONAL")
  public void ft2 () 
  {
	  Reporter.log("ft2", true);
  }
  @Test(groups="SMOKE")
  public void St2 () 
  {
	  Reporter.log("St2", true);
  }
  @Test(groups="INTEGRATION")
  public void It2 () 
  {
	  Reporter.log("it2", true);
  }
  //..............................
  
  @Test(groups="FUNTIONAL")
  public void ft3 () 
  {
	  Reporter.log("ft3", true);
  }
  @Test(groups="SMOKE")
  public void St3 () 
  {
	  Reporter.log("st3", true);
  }
  @Test(groups="INTEGRATION")
  public void It3 () 
  {
	  Reporter.log("it3", true);
  }
  //..............................
  
  @Test(groups="FUNTIONAL")
  public void ft4 () 
  {
	  Reporter.log("ft4", true);
  }
  @Test(groups="SMOKE")
  public void St4 () 
  {
	  Reporter.log("st4", true);
  }
  @Test(groups="INTEGRATION")
  public void It4 () 
  {
	  Reporter.log("it4", true);
  }
  //...........................
  @Test(groups="FUNTIONAL")
  public void ft5 () 
  {
	  Reporter.log("ft5", true);
  }
  @Test(groups="SMOKE")
  public void St5 () 
  {
	  Reporter.log("st5", true);
  }
  @Test(groups="INTEGRATION")
  public void It5 () 
  {
	  Reporter.log("it5", true);
  }
  //.......................
  
  @Test(groups="FUNTIONAL")
  public void ft6 () 
  {
	  Reporter.log("ft6", true);
  }
  @Test(groups="SMOKE")
  public void St6 () 
  {
	  Reporter.log("st6", true);
  }
  @Test(groups="INTEGRATION")
  public void It6 () 
  {
	  Reporter.log("it6", true);
  }
  
}
