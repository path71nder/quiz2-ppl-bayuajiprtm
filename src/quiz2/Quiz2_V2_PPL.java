/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;
import static org.openqa.grid.common.SeleniumProtocol.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/**
 *
 * @author ASUS
 */
public class Quiz2_V2_PPL {

    /**
     * @param args the command line arguments
     */
    private static WebDriver driver = null;
    
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        String user = "admin";
        String pass = "admin";
        System.setProperty("webdriver.chrome.driver", "D:\\Tugas\\Pengujian Perangkat Lunak\\Selenium\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.1crmcloud.com/login.php");
        driver.get("https://demo.1crmcloud.com/index.php");
        WebElement username = driver.findElement(By.name("user_name"));
        username.sendKeys(user);
        WebElement password = driver.findElement(By.name("user_password"));
        password.sendKeys(pass);
        WebElement button = driver.findElement(By.className("btn-label"));
        button.click();
        Thread.sleep(20000);
        WebElement adminbutton = driver.findElement(By.className("meta-profile"));
        adminbutton.click();
    }
    
}
