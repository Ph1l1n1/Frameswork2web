package Simple_action;

import Pages.Page_Mobile_tariffs;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Inputs {


    private Logger logger = Logger.getLogger(Page_Mobile_tariffs.class);
    private String name;
    private WebDriver webDriver;


    public Inputs(WebDriver webDriver, String name) {
        this.name = name;
        this.webDriver = webDriver;
    }

    public Inputs setinput(String value) {
        webDriver.findElement(By.xpath(String.format("//*[contains(@label,'%s')]", name))).sendKeys(value);
        return this;
    }


    public Inputs click() {
        logger.info("Клик поля " + name);
        WebElement webElement = webDriver.findElement(By.xpath(String.format("//*[contains(@class,'FormField') and contains(string(),'%s')]", name)));
        webElement.click();
        return this;
    }




}
