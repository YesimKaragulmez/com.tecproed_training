package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators_xPath {
    public static void main(String[] args) {
     /*   Create a class : Locators_xpath
        Create main method and complete the following task.
        When user goes to http://a.testaddressbook.com/sign_in
        Locate the elements of email textbox,password textbox, and signin button
        Enter below username and password then click sign in button
        Username :  testtechproed@gmail.com
        Password : Test1234!
        Then verify that the expected user id  testtechproed@gmail.com
        Verify the Addresses and Sign Out  texts are displayed
        Find the number of total link on the page
        Sign out from the page
*/

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("http://a.testaddressbook.com/sign_in");
        //Locate the email textbox by absolute xpath
        WebElement emailBox = driver.findElement(By.xpath("html/body/div/div/div/div/form/div[1]/input"));
        emailBox.sendKeys("testtechproed@gmail.com");
        //Locate the password textbox by relative xpath
        WebElement passwordText = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
        passwordText.sendKeys("Test1234!");
        //Locate the sing in button
        WebElement signInButton = driver.findElement(By.xpath("//input[@type='submit']"));
        signInButton.click();

        //locating the id
        WebElement id = driver.findElement(By.xpath("//span[@class='navbar-text']"));
        System.out.println("ID : " + id.getText());

        //Locating the Addresses
        WebElement adresses = driver.findElement(By.xpath("//a[@class='nav-item nav-link']"));
        System.out.println("Adresses" + adresses);

        //Locating Sign Out
        WebElement signOut = driver.findElement(By.xpath("//a[@data-test='sign-out']"));
        System.out.println("Sign Out:" + signOut);

        List<WebElement> listOfLinkElement = driver.findElements(By.xpath("//a[@class='nav-item nav-link']"));
        System.out.println(listOfLinkElement.size());

        signOut.click();
    }


}

