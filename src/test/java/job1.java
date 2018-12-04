import Pages.Page_Jobtinkoff;
import Simple_action.Checkbox;
import org.apache.log4j.Logger;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import Pages.Page_Mobile_tariffs;

import java.util.ArrayList;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;


public class job1 extends BaseRunner {

    private Logger logger = Logger.getLogger(Page_Mobile_tariffs.class);


    @Test
    public void checkButton() {
        Page_Jobtinkoff Page_Jobtinkoff = new Page_Jobtinkoff(webDriver);
        Page_Jobtinkoff.open().clickinput("Фамилия, имя и отчество").
                clickinput("Электронная почта").
                clickinput("Номер телефона").
                clickinput("Город").
                clickinput("Выберите вакансию").
                clickinput("Город"); // Для снятия фокуса с последнего поля

        Assert.assertEquals("Поле обязательное", Page_Jobtinkoff.geterror("Фамилия, имя и отчество"));
        Assert.assertEquals("Поле обязательное", Page_Jobtinkoff.geterror("Электронная почта"));
        Assert.assertEquals("Необходимо указать номер телефона", Page_Jobtinkoff.geterror("Номер телефона"));
        Assert.assertEquals("Поле обязательное", Page_Jobtinkoff.geterror("Город"));
        Assert.assertEquals("Поле обязательное", Page_Jobtinkoff.geterror("Выберите вакансию"));


        System.out.println("test finish");
    }


}
