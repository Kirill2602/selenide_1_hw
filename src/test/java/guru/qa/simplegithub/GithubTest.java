package guru.qa.simplegithub;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GithubTest {
    @Test
    public void githubTest() {
        open("https://github.com/");
        $("[data-test-selector='nav-search-input']").setValue("selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").shouldHave(text("selenide/selenide")).click();
        $("#user-content-what-is-selenide").parent().shouldHave(text("What is Selenide?"));
        $("#wiki-tab").click();
        $$("ul li a").findBy(text("Soft Assertions")).shouldBe(visible).click();
        $("#user-content-3-using-junit5-extend-test-class").parent().shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}
