package Class01;

import org.testng.annotations.Test;

public class DepondsOn {
    @Test
    public void login(){
        System.out.println("This is login");
    }
    @Test(dependsOnMethods = "login")
    public void verificationOfDashboard(){
        System.out.println("This is dashboard");
    }

}
