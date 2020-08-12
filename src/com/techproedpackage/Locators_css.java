package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_css {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://a.testaddressbook.com/sign_in");
        //email textbox
        //<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
        //tag[attribute='attibute value']
        WebElement emailBox = driver.findElement(By.cssSelector("input[type='email']"));
        emailBox.sendKeys("testtechproed@gmail.com");
        //pass word textbox
        //<input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]" id="session_password">
        WebElement passwordBox = driver.findElement(By.cssSelector("input[id='session_password']"));
        //OR driver.findElement(By.cssSelector("input[type='password']"));
        passwordBox.sendKeys("Test1234!");
        //singin Button
        //<input type="submit" name="commit" value="Sign in" class="btn btn-primary" data-test="submit" data-disable-with="Sign in">
        WebElement signinButton = driver.findElement(By.cssSelector("input[name='commit']"));
        //OR driver.findElement(By.cssSelector("input[type='submit']"));
        signinButton.click();
    }
}
















