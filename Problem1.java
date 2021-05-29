import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Solution {
    public static WebDriver driver;
    static final String AB = "abcdefghijklmnopqrstuvwxyz";
    static final String NUM = "1234567890";
    static SecureRandom rnd = new SecureRandom();

    public static void main(String[] args) 
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("http://automationpractice.com/index.php");
        
        driver.findElement(By.xpath("//"[@class=\"login\"]/a")).click();
        driver.findElement(By.xpath("//"[@id=\"email_create\"]")).sendKeys(randomString(10) + "@gmail.com");
        driver.findElement(By.xpath("//"[@id=\"SubmitCreate\"]/button")).click();
        
        driver.findElement(By.xpath("//"[@id=\"id_gender2\"]")).click();
        driver.findElement(By.xpath("//"[@id=\"email_create\"]")).sendKeys("@gmail.com");
        driver.findElement(By.xpath("//"[@id=\"customer_firstname\"]")).sendKeys(randomString(5));
        driver.findElement(By.xpath("//"[@id=\"customer_lastname\"]")).sendKeys(randomString(5));
        
        String password = randomString(5);
        driver.findElement(By.xpath("//"[@id=\"passwd\"]")).sendKeys(password);
        driver.findElement(By.xpath("//"[@id=\"days\"]")).sendKeys("1");
        driver.findElement(By.xpath("//"[@id=\"months\"]")).sendKeys("1");
        driver.findElement(By.xpath("//"[@id=\"uniform-years\"]")).sendKeys("2002");
        
        
        driver.findElement(By.xpath("//"[@id=\"firstname\"]")).sendKeys(randomString(5));
        driver.findElement(By.xpath("//"[@id=\"lastname\"]")).sendKeys(randomString(5));
        driver.findElement(By.xpath("//"[@id=\"company\"]")).sendKeys(randomString(5));
        driver.findElement(By.xpath("//"[@id=\"address1\"]")).sendKeys(randomString(5));
        driver.findElement(By.xpath("//"[@id=\"address2\"]")).sendKeys(randomString(5));
        driver.findElement(By.xpath("//"[@id=\"city\"]")).sendKeys(randomString(5));
        driver.findElement(By.xpath("//"[@id=\"id_state\"]")).sendKeys("Alaska");
        driver.findElement(By.xpath("//"[@id=\"id_country\"]")).sendKeys("United States");
        driver.findElement(By.xpath("//"[@id=\"other\"]")).sendKeys(randomString(15));
        driver.findElement(By.xpath("//"[@id=\"phone\"]")).sendKeys(randomNumber(11));
        driver.findElement(By.xpath("//"[@id=\"phone_mobile\"]")).sendKeys(randomNumber(11));
        
        driver.findElement(By.xpath("//"[@id=\"submitAccount\"]/button")).click();
        
        driver.close();
    }
    
    public static String randomString(int len){
       StringBuilder sb = new StringBuilder(len);
       for(int i = 0; i < len; i++)
          sb.append(AB.charAt(rnd.nextInt(AB.length())));
       return sb.toString();
    }
    
    public static String randomNumber(int len){
       StringBuilder sb = new StringBuilder(len);
       for(int i = 0; i < len; i++)
          sb.append(NUM.charAt(rnd.nextInt(NUM.length())));
       return sb.toString();
    }
}
