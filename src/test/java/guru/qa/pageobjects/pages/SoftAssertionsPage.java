package guru.qa.pageobjects.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SoftAssertionsPage {
    SelenideElement junit5Examle = $("#user-content-3-using-junit5-extend-test-class").parent();

    public void checkAvailabilityJunit5Examle(String value) {
        junit5Examle.shouldHave(text(value));
    }
}
