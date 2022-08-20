package github;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class TestGitHub {


    @Test
    void pageSoftAssertions(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-body").shouldHave(text("Soft assertions"));
        $("li.wiki-more-pages-link button").click();
        $("ul[data-filterable-for='wiki-pages-filter']").shouldHave(text("SoftAssertions"));
        $x("//a[text()='SoftAssertions']").click();
        $("div.markdown-body").shouldHave(text("JUnit5"));
    }



}
