package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face_Login_Page {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        //locating email box using css locator

        WebElement emailTextbox = driver.findElement(By.cssSelector("input#email"));
        emailTextbox.sendKeys("testusername");
        //locating pass box using css locator
        WebElement passwordTextbox = driver.findElement(By.cssSelector("input#pass"));
        passwordTextbox.sendKeys("testuserpass");
        //locating teh login button
        //  WebElement loginButton=driver.findElement(By.cssSelector("input#u_0_b"));
        //  loginButton.click();

        //Locate the radio buttons for all of them
        //On radio buttons, we can only pick one option
        WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        male.click();
        WebElement custom = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
/*
Using the same class
1.Find the webelements of
"Sign Up"
"Connect with friends and the world around you on Facebook."
2.Locate and send text to
"First name"=testfirstname
"Last name"=testlastname
"Mobiel number or email"=test@gmail.com
"New Password"=testpassword



        WebElement signUp = driver.findElement(By.cssSelector("h2._8est"));
        System.out.println("Sign Up");

        WebElement text = driver.findElement(By.cssSelector("h2._8eso"));
        System.out.println("Connect with friends and the world around you on Facebook");

        WebElement firstName=driver.findElement(By.cssSelector("input#u_0_m"));
        firstName.sendKeys("testfirstname");
        //locating pass box using css locator
        WebElement lastName=driver.findElement(By.cssSelector("input#u_0_o"));
        lastName.sendKeys("testlastname");

        WebElement email=driver.findElement(By.cssSelector("input#u_0_r"));
        email.sendKeys("test@gmail.com");
        //locating pass box using css locator

        WebElement password=driver.findElement(By.cssSelector("input#u_0_w"));
        password.sendKeys("testpassword");
*/


        WebElement signUp = driver.findElement(By.xpath("//h2[@class='_8est']"));
        System.out.println(signUp.getText());

        WebElement connectFriendsText = driver.findElement(By.xpath("//h2[@class='_8eso _3ma']"));
        System.out.println(connectFriendsText.getText());

        WebElement firstNameBox = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstNameBox.sendKeys("testfirstname");

        WebElement lastNameBox = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastNameBox.sendKeys("testlastname");

        WebElement numberBox = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        numberBox.sendKeys("test@gmail.com");

        WebElement newPasswordBox = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        newPasswordBox.sendKeys("testpassword");


    }


}

