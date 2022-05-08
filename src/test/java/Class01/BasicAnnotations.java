package Class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotations{
//tests are executed based on alphabeth
    @Test
    public void firstTest(){
        System.out.println("This is first test case");
    }
    @Test
    public void secondTest(){
        System.out.println("This is second test case");
    }
    @Test
    public void thirdTest(){
        System.out.println("This is third test case");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is executd before @test method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("This is executd after @test method");
    }
}
