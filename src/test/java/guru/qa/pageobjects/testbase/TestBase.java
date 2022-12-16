package guru.qa.pageobjects.testbase;

import com.codeborne.selenide.Configuration;
import guru.qa.pageobjects.testdata.TestData;
import org.junit.jupiter.api.BeforeAll;

public class TestBase extends TestData {
    @BeforeAll
    public static void setUp() {
        Configuration.browserSize = "1920x1980";
        Configuration.baseUrl = "https://github.com";
    }
}
