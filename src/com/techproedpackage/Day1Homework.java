package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Homework {
    public static void main(String[] args) {
    /*Create a new class : Day1Homework
Using ChromeDriver, Go to facebook and verify if page title is “facebook”, If not, print the correct title.
Verify if the page URL contains facebook; if not, print the right url.
Then Navigate to https://www.walmart.com/
Verify if the walmart page title includes “Walmart.com”
Navigate back to facebook
Refresh the page
Maximize the window
Close the browser



     */

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //getting the actual title
        String actualFacebookTitle = driver.getTitle();
        //expected title
        String expextedFacebookTitle = "youtube";
        //verifying if actual title = expected title
        if (actualFacebookTitle.equals(expextedFacebookTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("ACTUAL YOUTUBE TITLE IS " + actualFacebookTitle);
        }
        //getting the current URL
        String actualFacebookURL = driver.getCurrentUrl();
        //Expected url = "youtube"
        String expectedFacebookURL = "youtube";
        //Verifying if actual facebook url contains the expected facebook URL
        //We want to have dynamic code. It means code should not be hard coded
        if (actualFacebookURL.contains(expectedFacebookURL)) {
            System.out.println("PASS");
        } else {
            System.out.println("CORRECT URL IS " + actualFacebookURL);
        }
        driver.navigate().to("https://www.walmart.com/");

        String actualWalmartTitle = driver.getTitle();
        //expected title
        String expectedWalmartTitle = "Amazon";
        //check if actual title includes the expected title
        if (actualWalmartTitle.contains(expectedWalmartTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("ACTUAL TITLE IS : " + actualWalmartTitle);
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.quit();
    }


}