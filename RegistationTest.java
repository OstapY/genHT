import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistationTest {


    @Test
    public void Test() {
        OpenRegPage();
        ChoosePageObjectAndSetValue(firstName, inputFirstName);
        ChoosePageObjectAndSetValue(lastName, inputLastName);
        ChoosePageObjectAndSetValue(phone, inputPhone);
        ChoosePageObjectAndSetValue(email, inputEmail);
        ChoosePageObjectAndSetValue(address, inputAddress);
        ChoosePageObjectAndSetValue(roomNumber, inputRoomNumber);
        ChoosePageObjectAndSetValue(city, inputCity);
        ChoosePageObjectAndSetValue(state, inputState);
        ChoosePageObjectAndSetValue(postalcode, inputPostalCode);
        ChoosePageObjectAndSelectOption(country, inputCountry);
        ChoosePageObjectAndSetValue(userName,inputUserName);
        ChoosePageObjectAndSetValue(password, inputPassword);
        ChoosePageObjectAndSetValue(confirmPassword, inputConfirmPassword);
        ChoosePageObjectAndClick(sumbitButton);







    }


    //---------------------Realize Details---------------------------------------------------------
    SelenideElement object;
    //-----------------Input Data--------------------------------------------------------------
    String inputFirstName = ("bary");
    String inputLastName = ("tit");
    String inputPhone = ("380679790854");
    String inputEmail = ("example@gmail.com");
    String inputAddress = ("Kurulivska 39");
    String inputRoomNumber = ("24");
    String inputCity = ("Kiev");
    String inputState = ("Kiev");
    String inputPostalCode = ("320455");
    String inputCountry = ("212");
    String inputUserName = ("barytit");
    String inputPassword = ("trytogess");
    String inputConfirmPassword = ("trytogess");
    //-----------------Links------------------------------------------------------------------
    String mainUrl = ("http://newtours.demoaut.com/mercuryregister.php");


    //-----------------CSS--------------------------------------
    String firstName = ("[name=firstName]");
    String lastName = ("[name=lastName]");
    String phone = ("[name=phone]");
    String email = ("#userName");
    String address = ("[name=address1]");
    String roomNumber = ("[name=address2]");
    String city = ("[name=city]");
    String state = ("[name=state]");
    String postalcode =("[name=postalCode]");
    String country = ("[name=country]");
    String userName = ("#email");
    String password = ("[name=password]");
    String confirmPassword = ("[name=confirmPassword]");
    String sumbitButton = ("[name=register]");



    //-----------------Before Run--------------------------------------------------------------
    @BeforeClass
    public static void setupWebDriver() {
        WebDriverManager.chromedriver().setup();
    }


    //------------------Method realize body-----------------------------------------------------

    private void OpenRegPage() {
        open(mainUrl);
    }
    private void ChoosePageObjectAndClick(String objectCss){
        String result;
        result=objectCss;
        object = $(result);
        object.click();
    }

    private void ChoosePageObject(String objectCss){
        String result;
        result=objectCss;
        object = $(result);
    }

    private void ChoosePageObjectAndSetValue(String objectCss, String value){
        String result=objectCss;
        String text=value;
        object = $(result);
        object.setValue(text);
    }
    private void ChoosePageObjectAndSelectOption(String objectCss, String value){
        String result=objectCss;
        String text=value;
        object = $(result);
        object.selectOptionByValue(text);
    }
}