package Cookies;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookies {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// How to Print cookies from browser
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println("Size of Cookies :" + allCookies.size());

		for (Cookie cookie : allCookies) {
			System.out.println(cookie.getName() + ": " + cookie.getValue());

		}

		// How to Add cookies to the browser
		
		Cookie cookieobj= new Cookie("MyCookie1234", "12345");
		driver.manage().addCookie(cookieobj);
		System.out.println("Size of Cookies After adding :" + allCookies.size());
		Set<Cookie> allCookiesaf = driver.manage().getCookies();

		for (Cookie cookie : allCookiesaf) {
			System.out.println(cookie.getName() + ": " + cookie.getValue());

		}
		// How to Add cookies to the browser
       // driver.manage().deleteCookie(cookieobj);
       // driver.manage().deleteCookieNamed("MyCookie1234");

 	}

}
