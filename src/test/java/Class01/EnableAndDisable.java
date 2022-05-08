package Class01;

import org.testng.annotations.Test;

public class EnableAndDisable {
    @Test(enabled = false)
    public void FirstTest(){
        System.out.println("first");
    }
    @Test()
    public void SecondTest(){
        System.out.println("second");
    }
    @Test()
    public void ThirdTest(){
        System.out.println("third");
    }
}
