import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Tests {

    public static void main(String[] args){

        //FirefoxDriver driver = new FirefoxDriver();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/");
        WebElement element = driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");

        WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
        driver.close();

    }
}
