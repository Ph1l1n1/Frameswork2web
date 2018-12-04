package Simple_action;

import Pages.Page_Mobile_tariffs;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Input_Errors {

    private Logger logger = Logger.getLogger(Page_Mobile_tariffs.class);
    private String input_name;
    private WebDriver webDriver;


    public Input_Errors(WebDriver webDriver, String name) {
        this.input_name = name;
        this.webDriver = webDriver;
    }

    public String geterror() {
        logger.info("Чтение ошибку поля " + input_name);
        String error = "";
        try {
            error = webDriver.findElement(By.xpath(String.format("//*[contains(@class,'FormField') and contains(string(),'%s')]//*[contains(@class,'Error')]", input_name))).getText();
        } catch (Exception ex) {

        }

        logger.info("Прочли ошибку поля " + input_name);
        return error;
    }

}
