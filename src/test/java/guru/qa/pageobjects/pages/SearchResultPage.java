package guru.qa.pageobjects.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {
    SelenideElement firstSearchResult = $$("ul.repo-list li").first().$("a");

    public void clickSelenideLink(String value) {
        firstSearchResult.shouldHave(text(value)).click();
    }
}
