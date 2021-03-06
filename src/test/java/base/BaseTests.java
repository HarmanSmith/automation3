package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        System.out.println(driver.getTitle());
        homePage = new HomePage(driver);
        driver.quit();
    }
    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
