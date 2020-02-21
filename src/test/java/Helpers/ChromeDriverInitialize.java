package Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeDriverInitialize {
    public void testGoogleDrive (){
        System.out.println("I create a web driver object \n");
        System.setProperty("webdriver.chrome.driver","/path/to/chromedriver");
        WebDriver driver= new ChromeDriver();
        System.out.println("I open a chrome tab on google.com");
        driver.get("http://www.google.com/");
        WebElement searchBox=driver.findElement(By.name("q"));
        System.out.println("I go to facebook.com");
        searchBox.sendKeys("www.facebook.com");
        searchBox.submit();
    }
}
