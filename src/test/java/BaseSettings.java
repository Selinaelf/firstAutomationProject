import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseSettings {

    protected WebDriver driver;
    AmazonPage amazonPage;
@BeforeAll
public  void setup(){
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.amazon.com.tr/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com.tr%2F%3Fie%3DUTF8%26tag%3Dtrtxtgostdde-21%26hvadid%3D509300435026%26hvpos%3D%26hvexid%3D%26hvnetw%3Dg%26hvrand%3D1239906510680639072%26hvpone%3D%26hvptwo%3D%26hvqmt%3Db%26hvdev%3Dc%26ref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=trflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
    System.out.println("test started");
    amazonPage=new AmazonPage(driver);
}
 /* @AfterAll
    public void end(){
  driver.quit();
    System.out.println("succesfull");
}*/
}
