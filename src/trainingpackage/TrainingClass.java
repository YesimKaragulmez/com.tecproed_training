package trainingpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrainingClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //creating chrome webdriver

        //going to the website using get(); method
        //To close the webdriver we use close(), or quit(),
        //What is the difference between close(), and quit(),
        //close() is closing only the current page but quit() all pages
        //driver.quit();
    }
}

