package Simple_action;

import Pages.Page_Mobile_tariffs;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox {

    private Logger logger = Logger.getLogger(Page_Mobile_tariffs.class);
    private String name;
    private WebDriver webDriver;
    private static final By CheckboxMusic = By.xpath("//div[@data-qa-file='UICheckbox' and contains(string(),'Музыка')]//div[@data-qa-file='UICheckbox']");


    public Checkbox(String name, WebDriver webDriver) {
        this.name = name;
        this.webDriver = webDriver;
    }


    public Checkbox setActive() {
        logger.info("Установка чекбокса");
        WebElement webElement = webDriver.findElement(By.xpath(String.format("//div[@data-qa-file='UICheckbox' and contains(string(),'%s')]//div[@data-qa-file='UICheckbox']", name)));
        if (!webElement.isSelected()) {
            webElement.click();
        }


        return this;
    }


}
