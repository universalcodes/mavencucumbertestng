package stepdefinationfolderfiles;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class AmazonSample {
	
	
	@Given("^url opened$")
public static void amazonproductsale() throws InterruptedException, IOException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url = "https://www.amazon.in/?tag=cuelinkss17692-21&ascsubtag=20200226cla8wily9bwh";
		driver.get(url);
		System.out.println(driver.getCurrentUrl());

		wait = new WebDriverWait(driver, 200000);
		
		

		Screenshot sc1= new AShot().takeScreenshot(driver);
		sc1= new AShot().takeScreenshot(driver);
		ImageIO.write(sc1.getImage(), "jpg", new File("C:\\Users\\Yogesh Kamra\\eclipse-workspace\\Completewebsite\\screenshots\\screenshot1.jpg"));

		
		driver.findElement(By.linkText("Sign in")).click();
		System.out.println("sign in URL: "+driver.getCurrentUrl());
		System.out.println("sign in title: "+driver.getTitle());
		
		Screenshot sc2= new AShot().takeScreenshot(driver);
		sc2= new AShot().takeScreenshot(driver);
		ImageIO.write(sc2.getImage(), "jpg", new File("C:\\Users\\Yogesh Kamra\\eclipse-workspace\\Completewebsite\\screenshots\\screenshot2.jpg"));


		
		driver.findElement(By.name("email")).sendKeys("yogeshkamra25@gmail.com");
		
		Screenshot sc3= new AShot().takeScreenshot(driver);
		sc3= new AShot().takeScreenshot(driver);
		ImageIO.write(sc3.getImage(), "jpg", new File("C:\\Users\\Yogesh Kamra\\eclipse-workspace\\Completewebsite\\screenshots\\screenshot3.jpg"));

		driver.findElement(By.id("continue")).click();

		System.out.println("sign 2 in URL: "+driver.getCurrentUrl());
		System.out.println("sign 2 in title: "+driver.getTitle());

		driver.findElement(By.name("rememberMe")).click();

		driver.findElement(By.name("password")).sendKeys("Yogesh@2511");

		Screenshot sc4= new AShot().takeScreenshot(driver);
		sc4= new AShot().takeScreenshot(driver);
		ImageIO.write(sc4.getImage(), "jpg", new File("C:\\Users\\Yogesh Kamra\\eclipse-workspace\\Completewebsite\\screenshots\\screenshot4.jpg"));

		driver.findElement(By.id("signInSubmit")).click();
		;

	/*	driver.findElement(By.name("password")).sendKeys("Yogesh@2511");
		System.out.println("final in URL: "+driver.getCurrentUrl());
		System.out.println("final in title: "+driver.getTitle());
		
		Screenshot sc5= new AShot().takeScreenshot(driver);
		sc5= new AShot().takeScreenshot(driver);
		ImageIO.write(sc5.getImage(), "jpg", new File("C:\\Users\\Yogesh Kamra\\eclipse-workspace\\Completewebsite\\screenshots\\screenshot5.jpg"));



		Thread.sleep(10000);

		driver.findElement(By.id("signInSubmit")).click();
		*/
		Screenshot sc6= new AShot().takeScreenshot(driver);
		sc6= new AShot().takeScreenshot(driver);
		ImageIO.write(sc6.getImage(), "jpg", new File("C:\\Users\\Yogesh Kamra\\eclipse-workspace\\Completewebsite\\screenshots\\screenshot6.jpg"));

		
		System.out.println("logged in URL"+driver.getCurrentUrl());
		System.out.println("Logged in Title: "+driver.getTitle());
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus 7T Pro");
		
		Screenshot sc7= new AShot().takeScreenshot(driver);
		sc7= new AShot().takeScreenshot(driver);
		ImageIO.write(sc7.getImage(), "jpg", new File("C:\\Users\\Yogesh Kamra\\eclipse-workspace\\Completewebsite\\screenshots\\screenshot7.jpg"));

		driver.findElement(By.tagName("input")).click();

		System.out.println("logged in URL"+driver.getCurrentUrl());
		System.out.println("Logged in Title: "+driver.getTitle());
		
		
		Screenshot sc8= new AShot().takeScreenshot(driver);
		sc8= new AShot().takeScreenshot(driver);
		ImageIO.write(sc8.getImage(), "jpg", new File("C:\\Users\\Yogesh Kamra\\eclipse-workspace\\Completewebsite\\screenshots\\screenshot8.jpg"));

		
		
		

		System.out.println("Screenshot Captured Successfully on git");
		
		driver.quit();



	}

	public static void main(String[] args) throws InterruptedException, IOException {

		
		
		
		amazonproductsale();
	}
}
