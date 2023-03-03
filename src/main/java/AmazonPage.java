import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonPage {
private WebDriver driver;
private By mail= By.id("ap_email");
    private By submitB1= By.xpath("//input[@id='continue']");
private By password=By.id("ap_password");
    private By submitB2= By.id("signInSubmit");

    public AmazonPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setMailAdress(String UserMailAdress){
        WebElement mailSpace=driver.findElement(mail);
        mailSpace.click();
        mailSpace.sendKeys(UserMailAdress);
    }
public void goPaswordSpace(){
        WebElement Paswordclick=driver.findElement(submitB1);
        Paswordclick.click();
    }
public void fillPasword(String UserPassword ){
        WebElement newpassword=driver.findElement(password);
        newpassword.click();
        newpassword.sendKeys(UserPassword);
}
public void signin(){
        WebElement signinB= driver.findElement(submitB2);
        signinB.click();
}

}
