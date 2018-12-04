package Pages;

import Simple_action.Input_Errors;
import Simple_action.Inputs;
import Simple_action.Selects;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Jobtinkoff {

    private WebDriver webDriver;
    private Logger logger = Logger.getLogger(Page_Mobile_tariffs.class);
    private static final String URL = "https://moscow-job.tinkoff.ru/";


    public Page_Jobtinkoff(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public Page_Jobtinkoff open() {
        logger.info("Открытие страницы: " + URL);
        webDriver.get(URL);
        logger.info("Страница открылась: " + URL);
        return this;
    }


    public Page_Jobtinkoff clickinput(String name) {
        Inputs inputs = new Inputs(webDriver, name);
        inputs.click();
        logger.info("Клик поля " + name + " выполнен");
        return this;
    }


    public String geterror(String s) {
        Input_Errors input_errors = new Input_Errors(webDriver, s);
        return input_errors.geterror();
    }

    public void setinput(String fieldname, String value) {
        Inputs inputs = new Inputs(webDriver, fieldname);
        inputs.setinput(value);


        logger.info("Поле :" + fieldname + " заполненно значением:" + value);
    }

    public void click_on_select_from_list(String name, String value) {
        Inputs inputs = new Inputs(webDriver, name);
        inputs.click();
        logger.info("Раскрыли список :" + name);
        Selects selects = new Selects(webDriver, value);
        selects.click_on_SelectItem();
        logger.info("Выбрали из списка значение :" + value);


    }
}
