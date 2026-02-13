package com.example.GroupCreationTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

import java.time.Duration;

public class GroupCreationTests {
  private WebDriver wd;  // wd переменная, являющаяся атрибутом объекта типа GroupCreationTests
//  private String baseUrl;
//  private boolean acceptNextAlert = true;
//  private StringBuffer verificationErrors = new StringBuffer();
 // private JavascriptExecutor js;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    login();  // вызов метода
  }

  private void login() {
    wd.get("http://localhost/addressbook/addressbook/group.php?selected%5B%5D=2&selected%5B%5D=1&selected%5B%5D=3&delete=Delete+group%28s%29");
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.xpath("//input[@value='Login']")).click();
  }

  @Test
  public void testGroupCreation() throws Exception {
    // рефакторинг тестового метода
    gotoGroupPage();
    openPage();
    initGroupCreation();
    fillGroupForm();
    submitGroupCreation();
    returnToGroupPage();
    logout();
  }

  private void logout() {
    wd.findElement(By.linkText("Logout")).click();
  }

  private void returnToGroupPage() {
    wd.findElement(By.linkText("group page")).click();
  }

  private void submitGroupCreation() {
    wd.findElement(By.name("submit")).click();
  }

  private void fillGroupForm() {
    wd.findElement(By.name("group_name")).click();
    wd.findElement(By.name("group_name")).clear();
    wd.findElement(By.name("group_name")).sendKeys("test1");
    wd.findElement(By.name("group_header")).click();
    wd.findElement(By.name("group_header")).clear();
    wd.findElement(By.name("group_header")).sendKeys("test2");
    wd.findElement(By.name("group_footer")).clear();
    wd.findElement(By.name("group_footer")).sendKeys("test3");
  }

  private void initGroupCreation() {
    wd.findElement(By.name("new")).click();
  }

  private void openPage() {
    wd.get("http://localhost/addressbook/addressbook/group.php");
  }

  private void gotoGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
