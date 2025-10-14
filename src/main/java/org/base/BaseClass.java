package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
public static  WebDriver chromeBrowser() {
		WebDriver driver=new ChromeDriver();
		return driver;	

	}
public static WebDriver browserLaunch(String bname) {
	if(bname.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}
	
	else if(bname.equalsIgnoreCase("edge")){
		driver=new EdgeDriver();
	}
	else if(bname.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
	}
	return driver;
	
}

public static void urlLaunch(String a) {
	driver.get(a);
	driver.manage().window().maximize();
	
}

public static  String getCurrentUrl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;

}
public static  String getTitle() {
	String title = driver.getTitle();
	return title;
}

public static void implecityWait(int a) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
	
}

public static void sendKeys(WebElement e,String value) {
	e.sendKeys(value);
	
}

public static void click(WebElement e) {
	e.click();
}
public static void quit() {
	driver.quit();
	
	}

public static String getText(WebElement e) {
	String text = e.getText();
	return text;
	}
public static String getAttribute(WebElement e) {
	String attribute = e.getAttribute("value");
	return attribute;

}

public static void moveToElement(WebElement e) {
	Actions a=new Actions(driver);
	a.moveToElement(e).perform();
	}

public static void drogAndDrop(WebElement src,WebElement tar) {
	Actions a=new Actions(driver);
	a.dragAndDrop(src, tar).perform();
	
}
public static void contextClick(WebElement e) {
	Actions a=new Actions(driver);
	a.contextClick(e).perform();

}
public static void doubleClick(WebElement e) {
	Actions a=new Actions(driver);
	a.doubleClick(e).perform();

}
public static void actionClick() {
	Actions a=new Actions(driver);
a.click().perform();
}

public static void selectByIndex(WebElement e,int index) {
	
	Select s=new Select(e);
	s.selectByIndex(index);
	}
public static  void selectByValue(WebElement e,String value) {
	Select s=new Select(e);
	s.selectByValue(value);
}
public static void selectByVisibleText(WebElement e,String text) {
Select s=new Select(e);
s.selectByVisibleText(text);


}
public static List<String> getOption(WebElement e) {
	Select s=new Select(e);
	List<WebElement> options = s.getOptions();
	List<String> li= new LinkedList<>();
	for (WebElement x : options) {
		li.add(x.getText());
	}
	return li;
	
}
public static void back() {
	driver.navigate().back();

}
public static void forWard() {
	driver.navigate().forward();
}
public static  void refresh() {
	driver.navigate().refresh();

}
public static  void enter() throws AWTException {
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
}
public static void windowshandle() {
	Set<String> id = driver.getWindowHandles();
	List<String> li=new ArrayList();
	li.addAll(id);
	driver.switchTo().window(li.get(1));
}
public static void accept() {
	Alert a = driver.switchTo().alert();
	a.accept();

}
public static void dismiss() {
	Alert a = driver.switchTo().alert();
a.dismiss();
}



}
