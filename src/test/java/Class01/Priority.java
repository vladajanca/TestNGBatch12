package Class01;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 3)
    public void FirstTest(){
        System.out.println("first");
    }
    @Test(priority = 2)
    public void SecondTest(){
        System.out.println("second");
    }
    @Test(priority = 1)
    public void ThirdTest(){
        System.out.println("third");
    }
}
