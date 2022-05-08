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

public class HardAssertion {
    //Go to syntax login
    //enter wrong credentials
    //verify the message is invalid Credentials
public static WebDriver driver;
    @BeforeMethod
    public void OpenBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
    }

    @Test
    public void VerifyCredentials(){

        String expectedText="Invalid credentials";
        WebElement username= driver.findElement(By.id("txtUsername"));
        username.sendKeys("123456");
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        driver.findElement(By.id("btnLogin")).click();
        String text = driver.findElement(By.id("spanMessage")).getText();
        //first: assertion comapres 2 strings
        Assert.assertEquals(text,expectedText);

        //second: asert if textbox is dysplayed
        Boolean displayed=username.isDisplayed();
        //assertion if it is actually displayd or not
        System.out.println("Hello World");
        Assert.assertTrue(displayed);

    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}

