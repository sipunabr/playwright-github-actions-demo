package org.learning;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaywrightDemoTests {

    @Test
    public void test(){
        Playwright playwright = Playwright.create();
        Page page = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true)).newPage();

        page.navigate("https://www.google.co.in/");
        page.waitForTimeout(2000);
        System.out.println("Page Title: "+page.title());

        Assert.assertTrue(page.title().contains("Google"));
    }

}