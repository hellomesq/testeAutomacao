package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteManeiro {

    @Test
    public void TesteWeb() {
        WebDriver driver = new ChromeDriver();
        driver.get("https:\\www.google.com");
        driver.getCurrentUrl().equals("https:\\www.google.com");
    }

}
