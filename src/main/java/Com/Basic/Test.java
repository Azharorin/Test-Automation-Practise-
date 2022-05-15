package Com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {

        public static WebDriver driver;
        public static void main(String[] args) {


        }
        public static void Chromelaunch(){
            System.setProperty("webdriver.chrome.driver","E:\\Training\\chromedriver.exe");


            driver= new ChromeDriver();
            driver.manage().window().maximize();


        }

        public static void openUrl(String url){
            driver.get(url);
        }
        public static void closebrowser(){
            driver.close();


        }

        public static void  waitImplicit(){
            //driver.manage().timeouts().implicitlyWait(ofSeconds(10));
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds((long) 5.0));

        }
}
