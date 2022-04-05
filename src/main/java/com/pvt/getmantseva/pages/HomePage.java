package com.pvt.getmantseva.pages;

import com.pvt.getmantseva.driver.DriverManager;
import com.pvt.getmantseva.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Collection;

import static java.lang.String.format;

public class HomePage extends BasePage {

  public Actions action = new Actions(DriverManager.getDriver());

  private static final String ONLINER_URL = "https://onliner.by/";
  private static final String TEXT_PATTERN = "%s[contains(text(), '%s')]";
  private static final String MENU_SECTION = "//*[contains(@class, 'b-main-navigation__text')]";
  private static final String SUBMENU =
      "//*[contains(@class, 'b-main-navigation__dropdown_visible')]";
  private static final String HEADER_XPATH =
      "//*[contains(@class, 'b-main-navigation__dropdown_visible')]"
          + "//span[contains(@class,'advert-sign')]";

  public void openOnlinerHomePage() {
    DriverManager.getDriver().get(ONLINER_URL);
  }

  public WebElement hoverOverAMenuItem(String sectionName) {
    return findElement(By.xpath(format(TEXT_PATTERN, MENU_SECTION, sectionName)));
  }

  public WebElement checkSubmenu() {
    return findElement(By.xpath(SUBMENU));
  }

  public Collection<String> getElementsFromHeader() {
    return getTextsFromWebElements(waitForElementsVisible(By.xpath(HEADER_XPATH)));
  }

}
