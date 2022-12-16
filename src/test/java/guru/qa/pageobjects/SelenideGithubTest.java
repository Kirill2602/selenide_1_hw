package guru.qa.pageobjects;

import guru.qa.pageobjects.pages.*;
import guru.qa.pageobjects.testbase.TestBase;
import org.junit.jupiter.api.Test;

public class SelenideGithubTest extends TestBase {
    GithubMainPage mainPage = new GithubMainPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    GithubSelenidePage githubSelenidePage = new GithubSelenidePage();
    WikiPage wikiPage = new WikiPage();
    SoftAssertionsPage softAssertionsPage = new SoftAssertionsPage();

    @Test
    void findSelenide() {
        mainPage.openPage().fillSearchField(getSearchText());
        searchResultPage.clickSelenideLink(getLinkText());
        githubSelenidePage.checkReadMeText(getReadMeText()).clickWikiTab();
        wikiPage.checkChapterSoftAssertions().clickSoftAssertionsLink();
        softAssertionsPage.checkAvailabilityJunit5Examle(getJunit5ExampleText());
    }
}
