import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class OrangeHRM {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        String url = "\n" + "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        wait.Thread(3000);
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        WebElement password =  driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        WebElement text=  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span"));
//      text.getText();
        System.out.println(text.getText());

        driver.quit();
    }
}