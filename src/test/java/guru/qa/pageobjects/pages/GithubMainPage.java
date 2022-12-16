package guru.qa.pageobjects.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubMainPage {
    SelenideElement searchField = $("[data-test-selector='nav-search-input']");

    public GithubMainPage openPage() {
        open("/");
        return this;
    }

    public void fillSearchField(String value) {
        searchField.setValue(value).pressEnter();
    }
}
