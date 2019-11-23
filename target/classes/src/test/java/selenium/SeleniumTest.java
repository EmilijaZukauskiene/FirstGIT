package selenium;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.hamcrest.core.Is.is;
public class SeleniumTest {
    @Test
    public void testTodayDate() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tdec\\IdeaProjects\\Introduction to webinar\\src\\test\\resources\\driver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://delfi.lt/");
        WebElement title = driver.findElement(By.className("header-date"));
        Assert.assertThat(title.getText(), is("Lapkričiо 19 d., antradienis"));
        driver.close();
    }
}