package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    public static WebDriver driver;

    public static void setUp(){
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver121.ece");
        driver = new ChromeDriver();
        String url = "https://zara,com";
        driver.get(url);

        LOG.info("Open broswer maximize");
        driver.manage().window().maximize();
    }

    public static void tearDown(){
        LOG.info("Close the broswe");
        driver.quit();
    }

    public static String returnBaseUrl(){
        return "https://zara.com";
    }
    public static String getBaseUrl(){
        String baseurl = returnBaseUrl();
        if(baseurl != null){
            return baseurl.replace("index.html" , "");
        }
        return baseurl;
    }
}