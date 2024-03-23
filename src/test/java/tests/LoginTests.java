package tests;

import org.testng.annotations.Test;

public class LoginTests extends TestBase{


    @Test
    public void loginSuccessTest(){
app.getHelperUser().openLoginRegistrationForm();
app.getHelperUser().fillLoginRegistrationForm("ira@gmail.com", "Mm6436");
    app.getHelperUser().submitLogin();
    }
}