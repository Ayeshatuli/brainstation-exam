import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Solution {
    public static WebDriver driver;
    
    public static void main(String[] args) 
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/");
        
        WebElement element = driver.findElement(By.xpath("//"[@id=\"u_0_2_YG\"]/a"));
        
        elemen.click();
        
        driver.close();
    }
}
