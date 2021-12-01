package com.company.Class24.task1;

public class WebDriverTester {
    public static void main(String[] args) {
        //from Parent to     Childs )))) always!
        WebDriver[] wd = {new ChromeDriver(), new FireFoxDriver()};
        for (WebDriver w : wd) {
            w.openBrowser();
            w.maximizeBrowser();
            w.closeBrowser();
            w.findElement();
        }
    }}