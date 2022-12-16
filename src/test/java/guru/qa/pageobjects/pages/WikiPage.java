package guru.qa.pageobjects.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class WikiPage {
    ElementsCollection chaptersList = $$("ul li a");

    public WikiPage checkChapterSoftAssertions() {
        chaptersList.findBy(Condition.text("Soft Assertions")).shouldBe(visible);
        return this;
    }

    public void clickSoftAssertionsLink() {
        chaptersList.findBy(Condition.text("Soft Assertions")).click();
    }
}
