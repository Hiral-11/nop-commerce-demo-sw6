package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement nopCommerceLogo;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOut;

    @CacheLookup
    @FindBy(linkText = "//ul[@class = 'top-menu notmobile']")
    WebElement topMenu;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computers;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronics;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu mobile']//a[normalize-space()='Apparel']")
    WebElement apparel;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu mobile']//a[normalize-space()='Digital downloads']")
    WebElement digitalDownloads;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu mobile']//a[normalize-space()='Books']")
    WebElement books;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu mobile']//a[normalize-space()='Jewelry']")
    WebElement jewelry;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu mobile']//a[normalize-space()='Gift Cards']")
    WebElement giftCards;


    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    public String getTextLogIn() {
        log.info("Getting text :" + loginLink.toString());
        return getTextFromElement(loginLink);
    }

    public void clickOnLogOutLink() {
        clickOnElement(logOut);
        log.info("Clicking on logout link : " + logOut.toString());
    }

    public String getTextLogOut() {
        log.info("Getting text : " + logOut.toString());
        return getTextFromElement(logOut);
    }

    public void clickOnComputers() {
        clickOnElement(computers);
        log.info("Clicking on computers : " + computers.toString());
    }

    public void clickOnElectronics() {
        clickOnElement(electronics);
        log.info("Clicking on eletronics : " + electronics.toString());
    }

    public void clickOnApparel() {
        clickOnElement(apparel);
        log.info("Clicking on apparel : " + apparel.toString());
    }

    public void clickOnDigitalDownloads() {
        clickOnElement(digitalDownloads);
        log.info("Clicking on digitalDownloads : " + digitalDownloads.toString());

    }

    public void clickOnBooks() {
        clickOnElement(books);
        log.info("Clicking on books : " + books.toString());
    }

    public void clickOnJewelry() {
        clickOnElement(jewelry);
        log.info("Clicking on jewelry : " + jewelry.toString());

    }

    public void clickOnGiftCards() {
        clickOnElement(giftCards);
        log.info("Clicking on giftCards: " + giftCards.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on registerLink: " + registerLink.toString());
    }


    public void selectMenu(String menu) {
        List<WebElement> topMenu = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']//li//a"));
        for (WebElement tabs : topMenu) {
            if (menu.equalsIgnoreCase(tabs.getText())) {
                tabs.click();
                break;
            }
        }
    }
}
