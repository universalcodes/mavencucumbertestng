package stepdefinationfolderfiles;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class AmazonSample {

	static WebDriver driver;

	public static void screenshotTaken() throws IOException {
		Screenshot sc1 = new AShot().takeScreenshot(driver);
		sc1 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(sc1.getImage(), "jpg",
				new File("C:\\Users\\Yogesh Kamra\\eclipse-workspace\\Completewebsite\\screenshots\\"
						+ System.currentTimeMillis() + "screenshot.jpg"));
	}

	@Given("^url opened$")
	public static void amazonproductsale() throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url = "https://www.amazon.in/";
		driver.get(url);
		System.out.println(driver.getCurrentUrl());
		wait = new WebDriverWait(driver, 200000);
		screenshotTaken();
		Actions elementhover = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/a[2]"));
		elementhover.moveToElement(ele).perform();
		driver.findElement(By.linkText("Sign in")).click();
		System.out.println("sign in URL: " + driver.getCurrentUrl());
		System.out.println("sign in title: " + driver.getTitle());
		screenshotTaken();
		driver.findElement(By.name("email")).sendKeys("yogeshkamra25@gmail.com");
		screenshotTaken();
		driver.findElement(By.id("continue")).click();
		System.out.println("sign 2 in URL: " + driver.getCurrentUrl());
		System.out.println("sign 2 in title: " + driver.getTitle());
		driver.findElement(By.name("rememberMe")).click();
		driver.findElement(By.name("password")).sendKeys("Yogesh@2511");
		screenshotTaken();
		driver.findElement(By.id("signInSubmit")).click();
		screenshotTaken();
		System.out.println("logged in URL" + driver.getCurrentUrl());
		System.out.println("Logged in Title: " + driver.getTitle());
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus 7T Pro");
		screenshotTaken();
		driver.findElement(By.tagName("input")).click();
		System.out.println("logged in URL" + driver.getCurrentUrl());
		System.out.println("Logged in Title: " + driver.getTitle());
		screenshotTaken();
		System.out.println("Screenshot Captured Successfully on git2020");
		driver.quit();

	}

	public static void main(String[] args) throws InterruptedException, IOException {

		amazonproductsale();
	}
}
