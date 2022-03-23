package com.HTMLUnitDemo;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDemo {

	public static void main(String[] args) throws EmailException, InterruptedException{
		/*// https://commons.apache.org/proper/commons-email/userguide.html -- use link for detailed guide
		Email email = new SimpleEmail();
		//use SMTP of your company
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("grv.singh2911@gmail.com", "lenovo@2911"));
		email.setSSLOnConnect(true);
		email.setFrom("nehasri1389@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail from Selenium");
		email.addTo("grv.singh2911@gmail.com");
		email.send();
		*/
		
		//Add maven dependency. Does not take screen shot. Is fastes headless browser
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://commons.apache.org/proper/commons-email/userguide.html");
		Thread.sleep(2000);
		driver.quit();
	}

}
