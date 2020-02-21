package Modules.login;

import PageObjects.LoginPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestLogin {

    @Test
    public void testLogin() throws Exception {
// driver.get("https:// www.facebook.com");
        //System.setProperty("webdriver.chrome.driver","/path/to/chromedriver");
        //WebDriver driver = new ChromeDriver();
        System.out.println("Webdriver object is initialized from the Chrome" +
                " driver initialize class");
        System.out.println("Elements are initialized");
        //LoginPage loginpage = PageFactory.initElements (driver,LoginPage.class);
        String user = "";
        String password = "";
        System.out.println("Here, the user and password would be set by the user builder class");
        //loginpage.setEmailTextBox(user);
        //loginpage.setPasswordTextBox(password);
        //loginpage.getLoginButton().click();

    }

}
