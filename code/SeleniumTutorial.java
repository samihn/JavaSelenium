/*Sam Hajnasrollahi
Selenium in JAVA Tutorial
 */

package com.Selenium_for_intellij;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class Main{

    public static void main (String[] args) throws InterruptedException { //throws InterruptedException
        System.out.println("Hello There");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Redirection\\shajnas\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        //maximize browser window size
        obj.manage().window().maximize();

//BROWSER COMMANDS
//-----------------------------------------------------------------------------------------
        //Opens browser
        String appURL = "https://www.apple.com";
        obj.get(appURL);


        //Current Title
        String Title = obj.getTitle();
        System.out.println("The title of the page is: " + Title);

        //current URL
        String URL = obj.getCurrentUrl();
        System.out.println("This is the URL: " + URL);

        /*Page Source
        String PageSource = obj.getPageSource();
        System.out.println(PageSource);
        */

//NAVIGATION COMMANDS
//-----------------------------------------------------------------------------------------

        Thread.sleep(3000);
        obj.navigate().to("http://www.google.com");

        //Forward & Back command
        obj.navigate().forward();
        obj.navigate().back();
        obj.navigate().forward();

        //Refresh page
        obj.navigate().refresh();
        Thread.sleep(3000);

//WebElement COMMANDS
//-------------------------------------------------------------------------------------
        //finds the element on page (textbox here),types in the box
        obj.findElement(By.name("q")).sendKeys("TD Bank");
        obj.findElement(By.name("q")).sendKeys(Keys.RETURN);

        Thread.sleep(3000);
        //clicks on images button, then clears the box
        obj.findElement(By.linkText("Images")).click();
        obj.findElement(By.name("q")).clear();
        Thread.sleep(3000);

        //Checks if an element is displayed or not (checking if more button is displayed), returns true
        boolean status = obj.findElement(By.linkText("More")).isDisplayed();
        System.out.println("Is the element displayed? " + status);

        //Checks if an element is enabled
        boolean status2 = obj.findElement(By.linkText("More")).isEnabled();
        System.out.println("Is the element enabled? " + status2);

        //Checks if an element is selected
        boolean status3 = obj.findElement(By.linkText("More")).isSelected();
        System.out.println("Is the element selected? " + status3);

        //Navigates to a new website, just to test out element.submit();
        obj.navigate().to("https://tdtotalrewards.ehr.com/default.ashx?classname=SPLASH&ReturnUrl=%2fUS%2fEN%2f_layouts%2fAuthenticate.aspx%3fSource%3d%252Fus%252Fen%252FPages%252Fdefault%252Easpx&Source=%2Fus%2Fen%2FPages%2Fdefault%2Easpx");
        Thread.sleep(3000);

        //On this page there are 2 enter buttons with the same linktext name, so below would pick the second "Enter" button
        obj.findElements(By.linkText("Enter")).get(1).click();
        Thread.sleep(5000);


        String innerTxt = obj.findElement(By.xpath("//*[@id='MegaMenu2_Nav_10']/span")).getText();
        System.out.println("The text is " + innerTxt);

        Dimension size = obj.findElement(By.xpath("//*[@id='MegaMenu2_Nav_10']/span")).getSize();
        System.out.println("The Height is " + size.height + " and the Width is " + size.width);

        Point point = obj.findElement(By.xpath("//*[@id='MegaMenu2_Nav_10']/span")).getLocation();
        System.out.println("X cordinate: " + point.x + " Y cordinate: " + point.y);

        //Close all windows, if you wanna close the current window, not all: .close()
        obj.quit();


        //Select a dropdown
            //import package Support.UI.Select
            //Select oSelect = new Select(driver.findElement(By.id("Country")));

        //Thread.sleep(5000);
        //obj.quit();

    }
}
