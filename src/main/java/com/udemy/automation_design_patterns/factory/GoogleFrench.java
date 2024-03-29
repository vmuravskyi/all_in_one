package com.udemy.automation_design_patterns.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

class GoogleFrench extends GoogleEnglish {

    @FindBy(css = "div#gws-output-pages-elements-homepage_additional_languages__als a")
    private WebElement language;

    public GoogleFrench(WebDriver driver) {
        super(driver);
    }

    @Override
    public void launchSite() {
        driver.get("https://google.fr");
        language.click();
    }

    @Override
    public void search(String keyword) {
        super.search(keyword);
    }

    @Override
    public int getResultCount() {
        return super.getResultCount();
    }

}
