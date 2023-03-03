import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestAmazon extends BaseSettings {


@Test
@Order(1)
    public void setMailAdress(){
amazonPage.setMailAdress("selinaesit@icloud.com");
 }
    @Test
    @Order(2)
  public void goPaswordSpace(){

    amazonPage.goPaswordSpace();
    }
    @Test
    @Order(3)
    public void fillPasword(){
        amazonPage.fillPasword("*****");

}
@Test
@Order(4)
    public void signin(){
        amazonPage.signin();

    }



}
