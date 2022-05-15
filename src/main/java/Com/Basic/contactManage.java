package Com.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Com.Basic.Test.Chromelaunch;

public class contactManage extends Test {
    public static void main(String[] args) {

        Chromelaunch();
        //openUrl(");
        openUrl("http://159.89.38.11/login");
        login();
        moveToContactManage();
        addContactWindow();
        addContact();


    }

    public static void login(){
        WebElement email = driver.findElement(By.xpath("//input[@id='email-1']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password-1']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='m_login_signin_submit']"));
        WebElement checkBox=driver.findElement(By.xpath("//input[@id='checkbox-1']"));

        email.clear();
        email.sendKeys("test@orangetoolz.com");

        password.clear();
        password.sendKeys("8Kh8nTe*^jdk");

        loginButton.click();
    }

    public static void moveToContactManage(){


        waitImplicit();



        WebElement sideMenu = driver.findElement(By.xpath("//div[@class='dt-sidebar__container position-relative']"));
        WebElement contactManageOption = driver.findElement(By.xpath("//a[@title='Contact Manage']"));

        Actions action = new Actions(driver);

        action.moveToElement(sideMenu).perform();

        contactManageOption.click();

    }

    public static void addContactWindow(){
        WebElement contactAdd = driver.findElement(By.xpath("//a[normalize-space()='Add Contact']"));

        contactAdd.click();
    }

    public static void addContact(){
        WebElement addGroup= driver.findElement(By.xpath("//span[normalize-space()='Add New Group']"));
        addGroup.click();
        WebElement tag= driver.findElement(By.xpath("//input[@name='name']"));
        tag.clear();
        tag.sendKeys("new dfd");


        //Add all the elements and operations
        WebElement description= driver.findElement(By.xpath("//textarea[@placeholder='Write your group description here...']"));
        description.clear();
        description.sendKeys("Peace Begins with smile");
        WebElement addTag =driver.findElement(By.xpath("//input[@id='submit-group']"));
        addTag.click();
        WebElement close =driver.findElement(By.xpath("//button[normalize-space()='Close']"));
        close.click();
        WebElement test =driver.findElement(By.xpath("//input[@id='checkbox-4-0122']"));
        test.click();
        WebElement clickbutton= driver.findElement(By.xpath("//button[normalize-space()='Add Contact']"));
        clickbutton.click();

        WebElement number = driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Number')]"));
        number.clear();
        number.sendKeys("017712664646");
        WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter Email address']"));

        email.clear();

        email.sendKeys("nadal@gmail.com");
        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='Enter First name']"));
        firstName.clear();
        firstName.sendKeys("rafael ");

        WebElement lastname= driver.findElement(By.xpath("//input[@placeholder='Enter Last name']"));
        lastname.clear();
        lastname.sendKeys("nadal");

        WebElement city = driver.findElement(By.xpath("//input[@placeholder='Enter your city']"));
        city.clear();
        city.sendKeys("Dhaka");

        WebElement state = driver.findElement(By.xpath("//input[@placeholder='Enter your state']"));

        state.clear();
        state.sendKeys("Faridpur");

        WebElement zip = driver.findElement(By.xpath("//input[@placeholder='Enter your Zip']"));
        zip.clear();
        zip.sendKeys("1533");

        WebElement country = driver.findElement(By.xpath("//input[@placeholder='Enter your country']"));
        country.clear();
        country.sendKeys("Bangladesh");

        WebElement address = driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']"));
        address.clear();
        address.sendKeys("Khilkhet");
        waitImplicit();

        WebElement datebox =driver.findElement(By.xpath("//input[@placeholder='Enter your birthday']"));
        datebox.clear();
        datebox.sendKeys("2009-05-20");
        clickbutton.click();









    }
}
