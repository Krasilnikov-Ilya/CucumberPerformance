import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class performanceLabSiteSteps {

    @Given("open url {string}")
    public void openUrl(String url) {
        Selenide.open(url);
    }

    @And("hover on {string}")
    public void hoverOn(String arg0) {
        $x("//*[text()='" + arg0 +"']").hover();
    }

    @And("click {string}")
    public void click(String arg0) {
        $x("//div[@class='full_menu_top']//*[text()='" + arg0 +"']").click();
    }

    @Then("check url is {string}")
    public void checkUrlIs(String url) {
        Assertions.assertEquals(url, WebDriverRunner.getWebDriver().getCurrentUrl());
    }

    @And("wait")
    public void wait1s() {
        Selenide.sleep(1000);
    }
}
