package Class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
    public static WebDriver driver;
    @BeforeMethod
    public void OpenBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
    }

    @Test
    public void VerifyCredentials(){

        SoftAssert soft=new SoftAssert();

        String expectedText="Invalid credentials 101";
        WebElement username= driver.findElement(By.id("txtUsername"));
        boolean displayed = username.isDisplayed();
        username.sendKeys("123456");
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        driver.findElement(By.id("btnLogin")).click();
        String text = driver.findElement(By.id("spanMessage")).getText();
        //asertion to make sure that the message is correct
        soft.assertEquals(text,expectedText);

        //validate the display is true or not
        System.out.println("Hello World");
        soft.assertTrue(displayed);

        //check all assertions
        soft.assertAll();

    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
