package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperUser extends HelperBase{
    public HelperUser(WebDriver wd) {
        super(wd);
    }
    public void openLoginRegistrationForm(String email, String password){
//        WebElement loginTab = wd.findElement(By.cssSelector("a[href = '/login']"));
//        loginTab.click();
        click(By.cssSelector("a[href = '/login']"));
    }
//
    public void fillLoginRegistrationForm(String email, String password){
        WebElement emailInput = wd.findElement(By.name("email"));
//    emailInput.click();
//    emailInput.clear();
//    emailInput.sendKeys();
    type(By.name("email"), email);


//    WebElement passwordInput = wd.findElement((By.))
type(By.xpath("//input[last()]"), password);
    }


    public void submitLogin(){
        click(By.xpath("//button[text() = 'Login']"));
    }
}