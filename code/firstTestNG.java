package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNG {

    @Test(priority = 1,description = "This will verify the login functionality")
    public void loginApplication(){
        System.out.println("This is my first test!");
        Assert.assertEquals(1,12);
    }

    @Test(priority = 2, description = "This will add certain items in the basket")
    public void selectItems(){
        System.out.println("Item Selected");
    }

    @Test(priority = 3, description = "This case will perform checkout operation")
    public void checkOut(){
        System.out.println("Checkout completed");
    }


}
