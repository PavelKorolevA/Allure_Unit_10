package allure;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class AnnotationSteps {
    private static final String REPOSITORY = "PavelKorolevA/demoQA-test";

    @Test
    public void AnnotatedSteps() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        //вот это одинаково для 10 тестов
        WebSteps steps = new WebSteps();
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.openRepository(REPOSITORY);

        //вот отсюда разное

        //скриншот
        steps.takeScreenshot();
    }
}
