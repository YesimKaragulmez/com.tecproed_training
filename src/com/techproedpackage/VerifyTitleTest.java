package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleTest {
    public static void main(String[] args) {

        // Create a new class: VerifyTitleTest
        // Navigate to google homepage
        // Verify if google title is “google”

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.tr");
        //to get the page title we use
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("PASS");

        } else {//this test case will fail
            System.out.println("FAIL");
            System.out.println("Expected Title : " + expectedTitle);
            System.out.println("Actual Title : " + actualTitle);
        }
        driver.quit();


    }
}
