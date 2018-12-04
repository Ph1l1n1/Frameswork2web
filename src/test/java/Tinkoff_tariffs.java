import Simple_action.Checkbox;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import Pages.Page_Mobile_tariffs;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;


public class Tinkoff_tariffs extends BaseRunner {


    @Test
    public void checkButton() {
        Page_Mobile_tariffs Page_Mobile_tariffs = new Page_Mobile_tariffs(webDriver);
        Page_Mobile_tariffs.open().approve_region();
        //Assert.assertEquals("Москва и Московская область", Page_Mobile_tariffs.getregion());
        String region = Page_Mobile_tariffs.getregion();
        Assert.assertThat(region, CoreMatchers.containsString("Москва"));

        Page_Mobile_tariffs.refresh();
        Assert.assertThat(Page_Mobile_tariffs.getregion(), CoreMatchers.containsString(region));

        Checkbox checkbox = new Checkbox("Музыка");
        checkbox.setActive(true);


        System.out.println("test success");

    }


}
