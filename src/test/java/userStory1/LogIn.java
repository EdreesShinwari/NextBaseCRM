package userStory1;

import Util.Driver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogIn {

  @BeforeMethod
    public void driverSetUp(){
    Driver.SetUpDrive();
    Driver.navigateToURL("https://login2.nextbasecrm.com/");
  }

  @Test()
  public void UserStory1(){

  }
}
