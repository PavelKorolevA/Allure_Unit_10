package allure;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LabelsTest {

    @Test
    @Owner("PavelKorolevA")
    @Severity(SeverityLevel.BLOCKER)
    @Feature("Задачи в репозитории")
    @Story("Создание новой задачи")
    @DisplayName("Проверка создания Issue для авторизованного пользователя")
    @Description(
            "Этот тест проверяет создание Issue когда происходит ...."
    )
    @Link(value = "Testing", url = "https://github.com")
    public void testAnnotatedLabels(){

    }

}
