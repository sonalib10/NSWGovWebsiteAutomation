package com.nswgovermentwebsite.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;


public class NewsPage extends Driver {


    public static Properties properties;

    static {
        try {
            properties = new Properties();
            InputStream fileInputStream = NewsPage.class.getClassLoader().getResourceAsStream("env.properties");
            properties.load(fileInputStream);
        } catch (IOException e) {
            System.out.println("env.properties file not found");
        }
    }

    public NewsPage(){
        super();
    }


    public static void navigateToURL() {
        driver.get(properties.getProperty("HOST"));
    }

 public static void clickSelectTopics(){
     scrollDown();
     driver.findElement(By.id("edit-fieldset-category")).click();
 }


    public static void clickApply(){
        scrollDownbyElement();
        driver.findElement(By.id("edit-submit-news")).click();
    }

//    public static void clickTopicElement(int i){
//        driver.findElement(By.xpath("//div[2]/div/div["+i+"]/div/label")).click();
//    }

    public static void selectAnyTopics(String labelname ) {
        List<WebElement> checkboxes = driver.findElements(By.xpath("//*[contains(@class,'nsw-form__checkbox-label option')]"));
       for (WebElement checkbox : checkboxes) {

           if(labelname.equals(checkbox.getText())){
               System.out.println(checkbox.getText());
               checkbox.click();
           }

       }

    }

    public static void clickResetAndVerifyFilterRemoved(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'edit-reset')]")));
        driver.findElement(By.xpath("//*[contains(@id,'edit-reset')]")).click();
        WebElement resetlinktext = driver.findElement(By.linkText("Telephone counselling open for people experiencing grief and bereavement"));
        Assert.assertEquals(true,resetlinktext.isDisplayed());
    }

    public static void verifyFilterIsApplied(){
        WebElement resetButton = driver.findElement(By.xpath("//*[contains(@id,'edit-reset')]"));
        Assert.assertEquals(true,resetButton.isDisplayed());


}

    public static void clickClose(){
        driver.close();
    }


    public static void scrollDown(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,350)", "");
    }

    public static  void scrollDownbyElement(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element  = driver.findElement(By.id("edit-submit-news"));
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

}
