import Pages.Page_Jobtinkoff;
import Simple_action.Checkbox;
import org.apache.log4j.Logger;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import Pages.Page_Mobile_tariffs;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;


public class job2 extends BaseRunner {


    private Logger logger = Logger.getLogger(Page_Mobile_tariffs.class);

    @Test
    public void checkButton() {
        Page_Jobtinkoff Page_Jobtinkoff = new Page_Jobtinkoff(webDriver);
        Page_Jobtinkoff.open();


        Page_Jobtinkoff.setinput("Фамилия, имя и отчество" , "Буслаев Филипп Алексеевич");
        Page_Jobtinkoff.setinput("Электронная почта" , "asef@asdf.ru");
        Page_Jobtinkoff.setinput("Номер телефона" , "9834567890");
        Page_Jobtinkoff.setinput("Город" , "Москва");
        Page_Jobtinkoff.click_on_select_from_list("Выберите вакансию","Специалист отдела электронной корреспонденции");

        Assert.assertEquals("", Page_Jobtinkoff.geterror("Фамилия, имя и отчество"));
        Assert.assertEquals("", Page_Jobtinkoff.geterror("Электронная почта"));
        Assert.assertEquals("", Page_Jobtinkoff.geterror("Номер телефона"));
        Assert.assertEquals("", Page_Jobtinkoff.geterror("Город"));
        Assert.assertEquals("", Page_Jobtinkoff.geterror("Выберите вакансию"));


        System.out.println("test success");
    }


}
