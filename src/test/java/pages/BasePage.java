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
        System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver121.exe");
        driver = new ChromeDriver();
        String url = "https://www.zara.com/ro/";
        driver.get(url);

        LOG.info("Open broswer maximize");
        driver.manage().window().maximize();
    }

    public static void tearDown(){
        LOG.info("Close the broswe");
        driver.quit();
    }

    public static String returnBaseUrl(){
        return "https://www.zara.com/ro/";
    }
    public static String getBaseUrl(){
        String baseurl = returnBaseUrl();
        if(baseurl != null){
            return baseurl.replace("index.html" , "");
        }
        return baseurl;
    }

    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}