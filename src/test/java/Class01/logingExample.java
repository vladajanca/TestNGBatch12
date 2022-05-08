package Class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class logingExample {
    public static WebDriver driver;
    //to login into syntax HNRM application using testNG tool with following credentials
    //username: Admin
    //password : 12345
    @Test(priority = 2)
    public void invalidCredentials1(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("12345");
        driver.findElement(By.id("btnLogin")).click();
        String text = driver.findElement(By.id("spanMessage")).getText();
        System.out.println(text);



    }


    //to login into syntax HNRM application using testNG tool with following credentials
    //username: NoAdmin
    //password : 123456
    @Test(priority = 1)
    public void invalidCredentials2(){

        driver.findElement(By.id("txtUsername")).sendKeys("NoAdmin");
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        driver.findElement(By.id("btnLogin")).click();
        String text = driver.findElement(By.id("spanMessage")).getText();
        System.out.println(text);

    }
    //precondition -->open the browser and navigate to URL
    @BeforeMethod
    public void OpenBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
