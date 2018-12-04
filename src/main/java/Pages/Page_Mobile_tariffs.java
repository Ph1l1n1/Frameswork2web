package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page_Mobile_tariffs {
    private WebDriver webDriver;
    private Logger logger = Logger.getLogger(Page_Mobile_tariffs.class);
    private static final String URL = "https://www.tinkoff.ru/mobile-operator/tariffs/";
    private static final By approve_region = By.xpath("//*[@class='MvnoRegionConfirmation__option_3mrvz MvnoRegionConfirmation__optionAgreement_3M5qT']");
    private static final By get_region = By.xpath("//*[@class='MvnoRegionConfirmation__title_3WFCP']");
    private static final By CheckboxMusic = By.xpath("//div[@data-qa-file=\"UICheckbox\" and contains(string(),'Музыка')]//div[@data-qa-file=\"UICheckbox\"]");


    public Page_Mobile_tariffs(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public Page_Mobile_tariffs open() {
        logger.info("Открытие страницы: " + URL);
        webDriver.get(URL);
        return this;
    }

    public Page_Mobile_tariffs approve_region() {
        logger.info("Подтверждение региона");
        WebElement webElement = webDriver.findElement(approve_region);
        new Actions(webDriver).click(webElement).perform();
        return this;
    }

    public String getregion () {
        logger.info("Забираем регион");
        WebElement webElement = webDriver.findElement(get_region);
        String text = webElement.getText();
        return text;

    }

    public Page_Mobile_tariffs refresh() {
        logger.info("Открытие страницы: " + URL);
        webDriver.navigate().refresh();
        return this;
    }


    public By checkboxMusic(){
        return CheckboxMusic;
    }

}
