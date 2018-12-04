package Simple_action;

import Pages.Page_Mobile_tariffs;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox {

    private WebDriver webDriver;
    private Logger logger = Logger.getLogger(Page_Mobile_tariffs.class);
    private String name;

    public Checkbox(String name) {
        this.name = name;
    }


    public Checkbox setActive(boolean active) {
        logger.info("Установка чекбокса");
        WebElement webElement = webDriver.findElement();

        if (!webElement.isEnabled()) {
            webElement.click();
        }

        return this;
    }


}
