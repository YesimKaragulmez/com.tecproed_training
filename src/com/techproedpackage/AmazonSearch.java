package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
    /*  • 1.Create a new class : AmazonSearch
   • 2.Go to https://www.amazon.com/
   • 3.Search for “porcelain teapot”
   • 4.Then click on "Best Sellers"
   • 5.Then print how many starts the ﬁrst product have
   • 5.Then click on ﬁrst product
   • 6.Then print the ﬁrst product name
   • 7.Then click on "Add to Card" button
   • 8.Then verify the "Sing-In" text is visible. Use if-else statement to veryfy the expexted

     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("porcelain teapot");
        searchBox.submit();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.partialLinkText("Today's Deals")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement howManyStars = driver.findElement(By.className("a-size-base"));
        System.out.println("how many stars html part " + howManyStars.getText());

        driver.findElement(By.xpath("(//span[@class='a-declarative'])[63]")).click();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement nameOfProduct = driver.findElement(By.id("productTitle"));
        System.out.println(nameOfProduct.getText());


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("add-to-cart-button")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.className("action-inner")).click();


        String actualResult = driver.findElement(By.className("a-spacing-small")).getText();
        String expectedResult = "Sing-In";
        if (actualResult.equals(expectedResult)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("Actual Result:" + actualResult);
        }


    }
}









