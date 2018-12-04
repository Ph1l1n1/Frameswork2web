package Simple_action;

import Pages.Page_Mobile_tariffs;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selects {

    private Logger logger = Logger.getLogger(Page_Mobile_tariffs.class);
    private String name;
    private WebDriver webDriver;


    public Selects(WebDriver webDriver, String name) {
        this.name = name;
        this.webDriver = webDriver;
    }


    public Selects click_on_SelectItem() {
        logger.info("Клик поля " + name + " из списка");
        WebElement webElement = webDriver.findElement(By.xpath(String.format("//*[contains(@class,'SelectItem__data') and contains(string(),'%s')]", name)));
        webElement.click();
        return this;
    }
}
