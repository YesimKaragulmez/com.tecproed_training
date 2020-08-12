package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Review {
    public static void main(String[] args) {

    /*Create a new class : Day1Review
Using ChromeDriver, Go to youtube and verify if page title is “youtube”, If not, print the correct title.
Verify if the page URL contains youtube if not, print the right url.
Then Navigate to https://www.amazon.com/
Navigate back to youtube
Refresh the page
Navigate forward to amazon
Maximize the window
Then verify if page title includes “Amazon”, If not, print the correct title.
Verify if the page URL is https://www.amazon.com/, if not print the correct url
Quit the browser
  */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        //getting the actual title
        String actualYoutubeTitle = driver.getTitle();
        //expected title
        String expextedYoutubeTitle = "youtube";
        //verifying if actual title = expected title
        if (actualYoutubeTitle.equals(expextedYoutubeTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("ACTUAL YOUTUBE TITLE IS " + actualYoutubeTitle);
        }
        //getting the current URL
        String actualYoutubeURL = driver.getCurrentUrl();
        //Expected url = "youtube"
        String expectedYoutubeURL = "youtube";
        //Verifying if actual youtube url contains the expected youtube URL
        //We want to have dynamic code. It means code should not be hard coded
        if (actualYoutubeURL.contains(expectedYoutubeURL)) {
            System.out.println("PASS");
        } else {
            System.out.println("CORRECT URL IS " + actualYoutubeURL);
        }
        //navigation to amazon
        driver.navigate().to("https://www.amazon.com/");
        //navigating back to previous page which is youtube
        //Putting some wait
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().back();
        //refreshing the page
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().refresh();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //navigate forward to amazon
        driver.navigate().forward();
        //maximize the window
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.manage().window().maximize();
        //get the actual title
        String actualAmazonTitle = driver.getTitle();
        //expected title
        String expectedAmazonTitle = "Amazon";
        //check if actual title includes the expected title
        if (actualAmazonTitle.contains(expectedAmazonTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("ACTUAL TITLE IS : " + actualAmazonTitle);
        }
        //Verify if page url is https://www.amazon.com/
        String actualAmazonURL = driver.getCurrentUrl();
        String expectedAmazonURL = "https://www.amazon.com/";
        if (actualAmazonURL.equals(expectedAmazonURL)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("ACTUAL AMAZON URL IS " + actualAmazonURL);
        }
        //closing the driver
        driver.quit();


    }
}

