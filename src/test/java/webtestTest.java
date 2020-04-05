import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class webtestTest {
    WebDriver driver=new ChromeDriver();

    @BeforeClass
    public static void setupBeforeclass()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jian\\Desktop\\学习资料\\chromedriver.exe");

    }
    @Before
    public  void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void maintest() throws InterruptedException {
        driver.get("https://y.qq.com/");
        Thread.sleep(10000);
        WebElement we=driver.findElement(By.className("popup__close"));
        we.click();
        we=driver.findElement(By.className("search_input__input"));
        System.out.println(we);
        we.sendKeys("buttercup");
        we=driver.findElement(By.className("search_input__btn"));
        assertEquals("search_input__btn",we.getAttribute("class"));
        we.click();Thread.sleep(100000);
    }
}