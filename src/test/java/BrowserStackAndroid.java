

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertNotNull;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class BrowserStackAndroid {

  public static String userName = "mayankmaurya2";
  public static String accessKey = "qwudT56wfMJxWLKKhRv1";

  public static void mobileTest(AppiumDriver<MobileElement>  driver) throws MalformedURLException, InterruptedException {
  
    String s=driver.getContext();
   System.out.println(s);
   Thread.sleep(3000);

    MobileElement search=driver.findElement(By.id("search_container"));
    search.click();
    MobileElement searchtext=driver.findElement(By.id("search_src_text"));
    searchtext.sendKeys("BrowserStack");
    searchtext.sendKeys(Keys.ENTER);
    Thread.sleep(3000);
   
//    List<AndroidElement> allProductsName = driver.findElementsByClassName("android.widget.TextView");
//    assert(allProductsName.size() > 0);

    // The driver.quit statement is required, otherwise the test continues to execute, leading to a timeout.
    driver.quit();
  }
  
  @Test
	public static void launchAndroidSamsungGalaxys8Plus() throws InterruptedException, UnsupportedEncodingException, URISyntaxException, IOException {
	  DesiredCapabilities caps = new DesiredCapabilities();

	    caps.setCapability("device", "Samsung Galaxy S8 Plus");
	    caps.setCapability("os_version", "7.0");
	    caps.setCapability("project", "App Automate Project");
	    caps.setCapability("build", "My First Build");
	    caps.setCapability("name", "Samsung Galaxy S8 Plus Test");
	    caps.setCapability("app", "bs://f2abf8712648fa274a4238f6cc637ca0a4a1ccbb");
	    caps.setCapability("browserstack.networkLogs", "true");
	    caps.setCapability("deviceOrientation", "landscape");
	    caps.setCapability("browserstack.timezone", "IST");
	    AppiumDriver<MobileElement> driver=new AppiumDriver<MobileElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
	    SessionId sessionid = ((RemoteWebDriver) driver).getSessionId();
	    System.out.println(sessionid);
	    mark(sessionid);
	    mobileTest(driver);

	}
  
  
  @Test
	public static void launchAndroidGooglePixel3Xl() throws InterruptedException, UnsupportedEncodingException, URISyntaxException, IOException {
	  DesiredCapabilities caps = new DesiredCapabilities();

	    caps.setCapability("device", "Google Pixel 3 XL");
	    caps.setCapability("os_version", "9.0");
	    caps.setCapability("project", "App Automate Project");
	    caps.setCapability("build", "My First Build");
	    caps.setCapability("name", "Google Pixel 3 XL Test");
	    caps.setCapability("app", "bs://f2abf8712648fa274a4238f6cc637ca0a4a1ccbb");
	    caps.setCapability("browserstack.networkLogs", "true");
	    caps.setCapability("browserstack.networkProfile", "2g-gprs-good");
	    
	    AppiumDriver<MobileElement> driver=new AppiumDriver<MobileElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
	    SessionId sessionid = ((RemoteWebDriver) driver).getSessionId();
	    System.out.println(sessionid);
	    mark(sessionid);
	    mobileTest(driver);

	}
  @Test
	public static void launchAndroidSamsungTabS6() throws InterruptedException, UnsupportedEncodingException, URISyntaxException, IOException {
	  DesiredCapabilities caps = new DesiredCapabilities();

	    caps.setCapability("device", "Samsung Galaxy Tab S6");
	    caps.setCapability("os_version", "9.0");
	    caps.setCapability("project", "App Automate Project");
	    caps.setCapability("build", "My First Build");
	    caps.setCapability("name", "Samsung Galaxy Tab S6 Test");
	    caps.setCapability("app", "bs://f2abf8712648fa274a4238f6cc637ca0a4a1ccbb");
	    caps.setCapability("browserstack.networkLogs", "true");
	    caps.setCapability("browserstack.geoLocation", "BG");
	    AppiumDriver<MobileElement> driver=new AppiumDriver<MobileElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
	    SessionId sessionid = ((RemoteWebDriver) driver).getSessionId();
	    System.out.println(sessionid);
	    mark(sessionid);
	    mobileTest(driver);

	}
  @Test
	public static void launchAndroidMotorolaG7() throws InterruptedException, UnsupportedEncodingException, URISyntaxException, IOException {
	  DesiredCapabilities caps = new DesiredCapabilities();

	    caps.setCapability("device", "Motorola Moto G7 Play");
	    caps.setCapability("os_version", "9.0");
	    caps.setCapability("project", "App Automate Project");
	    caps.setCapability("build", "My First Build");
	    caps.setCapability("name", "Motorola Moto G7 Play Test");
	    caps.setCapability("app", "bs://f2abf8712648fa274a4238f6cc637ca0a4a1ccbb");
	    caps.setCapability("browserstack.networkLogs", "true");
	    caps.setCapability("browserstack.gpsLocation", "40.730610,-73.935242");
	    AppiumDriver<MobileElement> driver=new AppiumDriver<MobileElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
	    SessionId sessionid = ((RemoteWebDriver) driver).getSessionId();
	    System.out.println(sessionid);
	    mark(sessionid);
	    mobileTest(driver);

	}
  
  public static void mark(SessionId sessionid) throws URISyntaxException, UnsupportedEncodingException, IOException {
	  URI uri = new URI("https://mayankmaurya2:qwudT56wfMJxWLKKhRv1@api.browserstack.com/app-automate/sessions/"+sessionid+".json");
	  HttpPut putRequest = new HttpPut(uri);

	  ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
	  nameValuePairs.add((new BasicNameValuePair("status", "passed")));
	  nameValuePairs.add((new BasicNameValuePair("reason", "")));
	  putRequest.setEntity(new UrlEncodedFormEntity(nameValuePairs));
	  HttpClientBuilder.create().build().execute(putRequest);
	}
  
}

