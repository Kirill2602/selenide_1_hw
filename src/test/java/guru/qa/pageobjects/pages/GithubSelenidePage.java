package guru.qa.pageobjects.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class GithubSelenidePage {
    SelenideElement wikiTab = $("#wiki-tab"),
            readMeText = $("#user-content-what-is-selenide").parent();


    public GithubSelenidePage checkReadMeText(String value) {
        readMeText.shouldHave(text(value));
        return this;
    }

    public void clickWikiTab() {
        wikiTab.click();
    }
}
