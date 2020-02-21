package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class LoginPage {
    WebElement emailTextBox;
    WebElement passwordTextBox;
    WebElement loginButton;
    WebElement forgotButton;
    WebElement logo;
    public LoginPage (){
        System.out.println("Aquí se instancia el web driver");
        System.out.println("Find elements by id");
    }
    public WebElement getEmailTextBox() {
        return emailTextBox;
    }
    public void setEmailTextBox(String emailTextBox) {
        this.emailTextBox.sendKeys(emailTextBox);
    }
    public WebElement getPasswordTextBox() {
        return passwordTextBox;
    }
    public void setPasswordTextBox(String passwordTextBox) {
        this.passwordTextBox.sendKeys(passwordTextBox);
    }
    public WebElement getLoginButton() {
        return loginButton;
    }
    public void setLoginButton(WebElement loginButton) {
        this.loginButton = loginButton;
    }
    public WebElement getForgotButton() {
        return forgotButton;
    }
    public void setForgotButton(WebElement forgotButton) {
        this.forgotButton = forgotButton;
    }
    public WebElement getLogo() {
        return logo;
    }
    public void setLogo(WebElement logo) {
        this.logo = logo;
    }
    public void clickOnLoginButton() { this.loginButton.click(); }
}