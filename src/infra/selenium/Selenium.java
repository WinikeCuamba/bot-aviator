package infra.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    private final WebDriver driver;

    public Selenium() {
        System.setProperty("webdriver.chrome.driver", "/home/winike/Documentos/bot-aviator-java/bot-aviator/driver/chromedriver");
        this.driver = new ChromeDriver();
    }

    public void navigate(String path) {
        this.driver.get(path);
    }

    public void sendKeysForInput(String keys, String xpath) {
        WebElement input = this.driver.findElement(By.xpath(xpath));
        input.sendKeys(keys);
    }

    public void sendKeysForInputWithClassName(String keys ,String className) {
        WebElement input = this.driver.findElement(By.className(className));
        input.sendKeys(keys);
    }

    public void clickWithXpath(String xpath) {
        WebElement element = this.driver.findElement(By.xpath(xpath));
        element.click();
    }
    public void clickWithId(String id) {
        WebElement element = this.driver.findElement(By.id(id));
        element.click();
    }

    public void clickWithClassName(String id) {
        WebElement element = this.driver.findElement(By.className(id));
        element.click();
    }

    public void waitTime(long time) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

}
